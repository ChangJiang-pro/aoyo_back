package com.buba.aoyo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.buba.aoyo.dto.AccessTokenDto;
import com.buba.aoyo.mapper.CustomMapper;
import com.buba.aoyo.pojo.AoyoCustom;
import com.buba.aoyo.pojo.AuthToken;
import com.buba.aoyo.pojo.AuthTokenModel;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.UserService;
import com.buba.aoyo.utils.Constant;
import com.buba.aoyo.utils.EncryptUtil;
import com.buba.aoyo.utils.StatusCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.joda.time.DateTime;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private CustomMapper customMapper;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Override
    public AuthTokenModel authUserAndCreateToken(String mobile, String code) throws Exception{
        AoyoCustom custom=selCustom(mobile,code);
        String resKey=Constant.REDIS_KEY+custom.getCustomId();
        if (custom != null){
            //失效掉以前仍然可以使用的accessToken
            stringRedisTemplate.opsForValue().set(resKey,"");
            //创建token对象
            AccessTokenDto accessTokenDto =
                    new AccessTokenDto(custom.getCustomId(),mobile,System.currentTimeMillis(), Constant.snowFlake.nextId().toString(),Constant.ACCESS_TOKEN_EXPIRE);
            //将对象转为字符串
            String accessTokenDtoJsonStr = objectMapper.writeValueAsString(accessTokenDto);
            //给定一个秘钥给字符串加密
            String accessToken = EncryptUtil.aesEncrypt(accessTokenDtoJsonStr, Constant.TOKEN_AUTH_KEY);
            //创建Token对象存储数据库
            AuthToken authToken = new AuthToken();
            authToken.setUserId(custom.getCustomId());
            authToken.setAccessToken(accessToken);
            authToken.setAccessExpire(Constant.ACCESS_TOKEN_EXPIRE);
            authToken.setTokenTimestamp(System.currentTimeMillis());
            authToken.setCreateTime(DateTime.now().toDate());
//          token对象存入redis
            stringRedisTemplate.opsForValue().set(resKey,JSONObject.toJSONString(authToken));
            AuthTokenModel authTokenModel = new AuthTokenModel(accessToken,Constant.ACCESS_TOKEN_EXPIRE);
            stringRedisTemplate.expire(resKey,3600L, TimeUnit.SECONDS);
            return  authTokenModel;
        }
        return null;
    }

    @Override
    public BaseResponse validateToken(String accessToken) {
        BaseResponse response=new BaseResponse(StatusCode.Success);
        try{
            if (StringUtils.isBlank(accessToken)){
                return new BaseResponse(StatusCode.AccessTokenNotBlank);
            }
             //为了防止token伪造,会额外做异步操作解析token
            AccessTokenDto accessTokenDto;
            try {
                accessTokenDto = parseAccessToken(accessToken);
            }catch (Exception e){
                return new BaseResponse(StatusCode.AccessTokenInvalidate);
            }
            //验证这个token是否存在
            String resKey=Constant.REDIS_KEY+accessTokenDto.getUserId();
            AuthToken authToken = JSONObject.parseObject(stringRedisTemplate.opsForValue().get(resKey),AuthToken.class);
            if (authToken == null){
                return new BaseResponse(StatusCode.AccessTokenNotExist);
            }
            if(accessTokenDto != null){
                //判断token是否过期
                if (System.currentTimeMillis() - accessTokenDto.getTimestamp() > accessTokenDto.getExpire()){
                    //失效token
                    this.invalidateByAccessToken(accessToken,accessTokenDto.getUserId());
                    return new BaseResponse(StatusCode.TokenValidateExpireToken);
                }
            }
        }catch (Exception e){
            return new BaseResponse(StatusCode.Fail,e.getMessage());
        }
        return response;
    }
//    查询客户
    @Override
    public AoyoCustom selCustom(String mobile,String code) {
        return customMapper.selCustom(mobile);
    }
    //    失效token
    public void invalidateByAccessToken(String accessToken,Integer id) {
        if (StringUtils.isNotBlank(accessToken)){
           stringRedisTemplate.delete(Constant.REDIS_KEY+id);
        }
    }
    //    解析token
    public AccessTokenDto parseAccessToken(String accessToken) throws Exception {
        String tokenJsonStr = EncryptUtil.aesDecrypt(accessToken, Constant.TOKEN_AUTH_KEY);
        return objectMapper.readValue(tokenJsonStr,AccessTokenDto.class);
    }

}
