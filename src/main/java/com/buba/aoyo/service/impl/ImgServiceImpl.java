package com.buba.aoyo.service.impl;

import com.buba.aoyo.mapper.ImgMapper;
import com.buba.aoyo.pojo.AoyoCommodityImg;
import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoGroupFeaturedServices;
import com.buba.aoyo.pojo.AoyoWorkOrderServe;
import com.buba.aoyo.service.ImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class  ImgServiceImpl implements ImgService {

    @Resource
    private ImgMapper imgMapper;

    /*查询轮播图*/
    @Override
    public List<AoyoCommodityImg> getCarouselList() {
        return imgMapper.getCarouselList();
    }

    /*首页功能按钮*/
    @Override
    public List<AoyoGroupFeaturedServices> getFunctionButtonList() {
        return imgMapper.getFunctionButtonList();
    }

    /*查询服务列表*/
    @Override
    public List<AoyoWorkOrderServe> getWorkServe() {
        return imgMapper.getWorkServe();
    }

    /*查询优惠券*/
    @Override
    public List<AoyoCoupon> receiveCoupon() {
        return imgMapper.receiveCoupon();
    }
}
