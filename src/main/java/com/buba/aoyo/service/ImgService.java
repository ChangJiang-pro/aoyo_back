package com.buba.aoyo.service;

import com.buba.aoyo.pojo.AoyoCommodityImg;
import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoGroupFeaturedServices;
import com.buba.aoyo.pojo.AoyoWorkOrderServe;

import java.util.List;

public interface ImgService {
    List<AoyoCommodityImg> getCarouselList();

    List<AoyoGroupFeaturedServices> getFunctionButtonList();

    List<AoyoWorkOrderServe> getWorkServe();

    List<AoyoCoupon> receiveCoupon();
}
