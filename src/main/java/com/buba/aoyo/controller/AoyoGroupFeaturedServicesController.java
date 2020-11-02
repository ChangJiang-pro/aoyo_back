package com.buba.aoyo.controller;

import com.buba.aoyo.mapper.AoyoGroupFeaturedServicesDao;
import com.buba.aoyo.pojo.AoyoGroupFeaturedServices;
import com.buba.aoyo.utils.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("AoyoGroupFeaturedServicesController")
public class AoyoGroupFeaturedServicesController {
    @Resource
    private AoyoGroupFeaturedServicesDao aoyoGroupFeaturedServicesDao;

    @RequestMapping("findAllAoyoGroupFeaturedServices")
    private JsonData findAllAoyoGroupFeaturedServices(){
        try {
            List<AoyoGroupFeaturedServices> allAoyoGroupFeaturedServices = aoyoGroupFeaturedServicesDao.findAllAoyoGroupFeaturedServices();
            return new JsonData(200,"成功",allAoyoGroupFeaturedServices);
        }catch (Exception e){
            return new JsonData(200,"失败");
        }
    }
}