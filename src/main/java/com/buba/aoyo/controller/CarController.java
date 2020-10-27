package com.buba.aoyo.controller;

import com.alibaba.fastjson.JSONArray;
import com.buba.aoyo.pojo.CarBrandHot;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.CarService;
import com.buba.aoyo.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("carBrand")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("getHotCarList")
    public BaseResponse getHotCarList(){
        List<CarBrandHot> list=carService.getHotCarList();
        return new BaseResponse(StatusCode.Success,list);
    }
}
