package com.buba.aoyo.controller;

import com.buba.aoyo.pojo.AoyoCommodityImg;
import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoGroupFeaturedServices;
import com.buba.aoyo.pojo.AoyoWorkOrderServe;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("platformDriver")
public class ImgController {
    @Autowired
    private ImgService imgService;

    /*查询轮播图*/
    @RequestMapping("getCarouselList")
        public BaseResponse getCarouselList() {
            List<AoyoCommodityImg> img = imgService.getCarouselList();
            System.out.println(img);
            return new BaseResponse(200,"成功",img);
    }

    /*查询功能按钮*/
    @RequestMapping("getFunctionButtonList")
    public BaseResponse getFunctionButtonList(Model m) {
        List<AoyoGroupFeaturedServices> type = imgService.getFunctionButtonList();
        System.out.println(type);
        return new BaseResponse(200,"成功",type);
    }

    /*查询服务列表*/
    @RequestMapping("getWorkServe")
    public BaseResponse getWorkServe(Model m) {
        List<AoyoWorkOrderServe> work = imgService.getWorkServe();
        System.out.println(work);
        return new BaseResponse(200,"成功",work);
    }

    /*查询优惠券*/
    @RequestMapping("receiveCoupon")
    public BaseResponse receiveCoupon(Model m) {
        List<AoyoCoupon> coupon = imgService.receiveCoupon();
        System.out.println(coupon);
        return new BaseResponse(200,"成功",coupon);
    }
}
