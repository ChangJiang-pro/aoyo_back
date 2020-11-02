package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.AoyoCommodityImg;
import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoGroupFeaturedServices;
import com.buba.aoyo.pojo.AoyoWorkOrderServe;

import java.util.List;

public interface ImgMapper {

    /*查询轮播图*/
    List<AoyoCommodityImg> getCarouselList();

    /*首页功能按钮*/
    List<AoyoGroupFeaturedServices> getFunctionButtonList();

    /*首页功能按钮跳转*/
    List<AoyoWorkOrderServe> getWorkServe();

    /*展示优惠券*/
    List<AoyoCoupon> receiveCoupon();
}
