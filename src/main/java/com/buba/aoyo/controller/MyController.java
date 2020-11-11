package com.buba.aoyo.controller;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.OSSObject;
import com.buba.aoyo.mapper.CustomMapper;
import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoCustom;
import com.buba.aoyo.pojo.AoyoCustomLicense;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.MyService;
import com.buba.aoyo.service.UserService;
import com.buba.aoyo.utils.*;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
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
//    实名认证
//    正面照
    @PostMapping("uploadFaceIdentityImg")
    public BaseResponse uploadFaceIdentityImg(@RequestParam(value = "file",required = false)MultipartFile multipartFile){
        System.out.println(multipartFile);
        String originalFilename =multipartFile.getOriginalFilename();
        //取得图片的格式后缀
        HashMap map = null;
        try {
            File file = new File(originalFilename);
            FileUtils.copyInputStreamToFile(multipartFile.getInputStream(),file);
            String upload = AliyunOSSUtil.upload(file);
            //对图片进行base64位编码
            String s = ImageUtils.encodeImgageToBase64(multipartFile.getInputStream());
            map = new HashMap();
            map.put("key","b1c8560faa70b2b20e0b9994f61ee330");
            map.put("image",s);
            map.put("side","front" );
            map.put("fileUrl",upload);
            String s1 = HttpClientUtil.doPost("http://apis.juhe.cn/idimage/verify", map);

            String fileUrl="https://wscdevil.oss-cn-beijing.aliyuncs.com/"+upload;
            HashMap map1 =new HashMap();
            map1.put("result",s1);
            map1.put("fileUrl",fileUrl);
            return new BaseResponse(StatusCode.Success,map1);
        } catch (IOException e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.Fail);
        }
    }
    //    反面照
    @PostMapping("uploadBackIdentityImg")
    public BaseResponse uploadBackIdentityImg(@RequestParam(value = "file",required = false)MultipartFile multipartFile){
        System.out.println(multipartFile);
        String originalFilename =multipartFile.getOriginalFilename();
        //取得图片的格式后缀
        HashMap map = null;
        try {
            File file = new File(originalFilename);
            FileUtils.copyInputStreamToFile(multipartFile.getInputStream(),file);
            String upload = AliyunOSSUtil.upload(file);
            //对图片进行base64位编码
            String s = ImageUtils.encodeImgageToBase64(multipartFile.getInputStream());
            map = new HashMap();
            map.put("key","b1c8560faa70b2b20e0b9994f61ee330");
            map.put("image",s);
            map.put("side","back");
            map.put("fileUrl",upload);
            String s1 = HttpClientUtil.doPost("http://apis.juhe.cn/idimage/verify", map);

            String fileUrl="https://wscdevil.oss-cn-beijing.aliyuncs.com/"+upload;
            HashMap map1 =new HashMap();
            map1.put("result",s1);
            map1.put("fileUrl",fileUrl);
            return new BaseResponse(StatusCode.Success,map1);
        } catch (IOException e) {
            e.printStackTrace();
            return new BaseResponse(StatusCode.Fail);
        }
}
//    保存身份信息
    @RequestMapping("saveCustomLicense")
    public BaseResponse saveCustomLicense(AoyoCustomLicense aoyoCustomLicense, HttpServletRequest request){
        System.out.println(aoyoCustomLicense);
        return myService.saveCustomLicense(aoyoCustomLicense,request);
    }
//    获取身份信息
    @RequestMapping("getCustomLicenseById")
    public BaseResponse getCustomLicenseById( HttpServletRequest request) throws Exception {
        String accessToken=request.getHeader("Ltoken");
        if(StringUtils.isBlank(accessToken)){
            return new BaseResponse(StatusCode.AccessTokenNotExist);
        }else{
            String result=EncryptUtil.aesDecrypt(accessToken,Constant.TOKEN_AUTH_KEY);
            AoyoCustom custom=userService.selCustom(JSONObject.parseObject(result).getString("userName"));
            AoyoCustomLicense aoyoCustomLicense=myService.getCustomLicenseById(custom.getCustomId());
            if(aoyoCustomLicense!=null)return new BaseResponse(StatusCode.Success,aoyoCustomLicense);
            else return new BaseResponse(StatusCode.Fail);

        }
    }
}

