package com.buba.aoyo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.buba.aoyo.mapper.CustomMapper;
import com.buba.aoyo.mapper.MyMapper;
import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoCustom;
import com.buba.aoyo.pojo.AoyoCustomCoupon;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.MyService;
import com.buba.aoyo.utils.Constant;
import com.buba.aoyo.utils.EncryptUtil;
import com.buba.aoyo.utils.StatusCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class MyServiceImpl implements MyService {
    @Resource
    private MyMapper myMapper;
    @Resource
    private CustomMapper customMapper;

//    获取优惠券列表
    @Override
    public List<AoyoCoupon> getCustomAllowReceiveCouponList() {
        return myMapper.getCustomAllowReceiveCouponList();
    }
//    领取优惠券
    @Override
    public BaseResponse receiveCoupon(Integer id, Integer classId, HttpServletRequest request) throws Exception {
        String accessToken=request.getHeader("Ltoken");
        if(StringUtils.isBlank(accessToken)){
            return new BaseResponse(StatusCode.AccessTokenNotExist);
        }else{
            String result=EncryptUtil.aesDecrypt(accessToken,Constant.TOKEN_AUTH_KEY);
            AoyoCustom custom=customMapper.selCustom(JSONObject.parseObject(result).getString("userName"));
            myMapper.updateCoupon(id);
            myMapper.insCouponCustom(id,custom.getCustomId());
        }
        return new BaseResponse(StatusCode.Success);
    }

    @Override
    public BaseResponse getCouponListByStatus(Integer id) {
        List<AoyoCustomCoupon> list=myMapper.getCouponListByStatus(id);
        return new BaseResponse(StatusCode.Success,list);
    }
}
