package com.buba.aoyo.controller;

import com.alibaba.fastjson.JSONObject;
import com.buba.aoyo.pojo.AoyoCustom;
import com.buba.aoyo.pojo.AuthTokenModel;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.UserService;
import com.buba.aoyo.utils.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("loginByMobile")
    public BaseResponse loginByMobile(String mobile,String code){
        Map<String,Object> map=new HashMap<>();
        //判断用户名或者密码u是否为空
        if(StringUtils.isBlank(mobile) || StringUtils.isBlank(code)){
            //提示用户名密码不能为空
            return new BaseResponse(StatusCode.UserNamePasswordNotBlank);
        }
        BaseResponse<Object> baseResponse = new BaseResponse<>(StatusCode.Success);
        try {
//          将custom和token存入data
            AoyoCustom custom=userService.selCustom(mobile);
            AuthTokenModel authTokenModel=userService.authUserAndCreateToken(mobile,code);
            map.put("token",authTokenModel.getAccessToken());
            map.put("custom",custom);
            //登录并创建token
            baseResponse.setData(map);
        }catch (Exception e){
            return new BaseResponse<>(StatusCode.Fail.getCode(),e.getMessage());
        }
        return baseResponse;
    }

//    发送短信验证码
    @RequestMapping("sendSMS")
    public BaseResponse sendSMS(String mobile){
//        生成四位随机数
        Integer num=(int)(Math.random()*9000)+1000;
        //SendSms.sendMSM(mobile,num.toString());
        System.out.println(num);
        return new BaseResponse(StatusCode.Success,num.toString());
    }

    //    微信登录
    @RequestMapping("wxLogin")
    public BaseResponse wxLogin(String code){
        Map map=new HashMap<>();
        map.put("appid",Constant.APP_ID);
        map.put("secret",Constant.APP_SECRET);
        map.put("js_code",code);
        map.put("grant_type",Constant.GRANT_TYPE);
        String wx=HttpClientUtil.doPost("https://api.weixin.qq.com/sns/jscode2session",map);

        return new BaseResponse(StatusCode.Success,JSONObject.parseObject(wx));
    }

//    解码
    @RequestMapping("decodeInfo")
    public BaseResponse decodeInfo(String encryptDataB64,String sessionKeyB64,String ivB64){
        String result = WeChatUtil.decryptData(encryptDataB64,sessionKeyB64,ivB64);
        System.out.println(result);
        String nickName=(String)JSONObject.parseObject(result).get("nickName");
        String mobile=userService.authNickName(nickName);

        if(!StringUtils.isBlank(mobile)){
            AoyoCustom custom=userService.selCustom(mobile);
            return new BaseResponse(StatusCode.Success,custom);
        }else {
            return new BaseResponse(StatusCode.BindPhone, JSONObject.parseObject(result));
        }
    }
//    手机号绑定
    @RequestMapping("wxLoginRegisterCustom")
    public BaseResponse wxLoginRegisterCustom(String code,AoyoCustom aoyoCustom){
        Map<String,Object> map=new HashMap<>();
        if(userService.selCustom(aoyoCustom.getMobile())!=null){
            //如果手机号已存在则直接更改openid
            userService.wxLoginUpdateCustom(aoyoCustom);
        }else {
            //如果不存在则绑定
            userService.wxLoginRegisterCustom(aoyoCustom);
        }
        BaseResponse<Object> baseResponse = new BaseResponse<>(StatusCode.Success);
//          将custom和token存入data
        try {
            AoyoCustom custom=userService.selCustom(aoyoCustom.getMobile());
            AuthTokenModel authTokenModel=userService.authUserAndCreateToken(aoyoCustom.getMobile(),code);
            map.put("custom",custom);
            map.put("token",authTokenModel.getAccessToken());
            //登录并创建token
            baseResponse.setData(map);
        }catch (Exception e){
            return new BaseResponse<>(StatusCode.Fail.getCode(),e.getMessage());
        }
        return baseResponse;
    }
}
