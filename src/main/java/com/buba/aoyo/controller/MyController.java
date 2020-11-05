package com.buba.aoyo.controller;

import com.alibaba.fastjson.JSONObject;
import com.buba.aoyo.mapper.CustomMapper;
import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoCustom;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.MyService;
import com.buba.aoyo.service.UserService;
import com.buba.aoyo.utils.Constant;
import com.buba.aoyo.utils.EncryptUtil;
import com.buba.aoyo.utils.StatusCode;
import com.google.gson.JsonObject;
import jdk.nashorn.internal.parser.Token;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("my")
@RestController
public class MyController {
    @Autowired
    private UserService userService;
    @Autowired
    private MyService myService;

    @RequestMapping("informationList")
    public BaseResponse informationList(HttpServletRequest request) throws Exception {
        String accessToken=request.getHeader("Ltoken");
        if(StringUtils.isBlank(accessToken)){
            return new BaseResponse(StatusCode.AccessTokenNotExist);
        }else{
            String result=EncryptUtil.aesDecrypt(accessToken,Constant.TOKEN_AUTH_KEY);
            AoyoCustom custom=userService.selCustom(JSONObject.parseObject(result).getString("userName"));
            System.out.println(custom);
            return new BaseResponse(StatusCode.Success,custom);
        }
    }
//    获取优惠券列表
    @RequestMapping("getCustomAllowReceiveCouponList")
    public BaseResponse getCustomAllowReceiveCouponList(){
        List<AoyoCoupon> list=myService.getCustomAllowReceiveCouponList();
        return new BaseResponse(StatusCode.Success,list);
    }
//    领取优惠券
    @RequestMapping("receiveCoupon")
    public BaseResponse receiveCoupon(Integer id ,Integer classId,HttpServletRequest request){
        try {
            return myService.receiveCoupon(id,classId,request);
        } catch (Exception e) {
            return new BaseResponse(StatusCode.Fail,e.toString());
        }

    }
//    个人优惠券列表
    @RequestMapping("getCouponListByStatus")
    public BaseResponse getCouponListByStatus(Integer id){
        return myService.getCouponListByStatus(id);
    }
}
