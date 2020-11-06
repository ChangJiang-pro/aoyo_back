package com.buba.aoyo.controller;

import com.buba.aoyo.pojo.CarBrand;
import com.buba.aoyo.pojo.CarBrandHot;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.CarService;
import com.buba.aoyo.utils.SendSms;
import com.buba.aoyo.utils.StatusCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("carBrand")
public class CarController {
    @Autowired
    private CarService carService;
//    获取热门车品牌
    @RequestMapping("getHotCarList")
    public BaseResponse getHotCarList(HttpServletRequest request){
        List<CarBrandHot> list=carService.getHotCarList();
        String accessToken = request.getHeader("Ltoken");
        if(StringUtils.isBlank(accessToken)){
            return new BaseResponse(StatusCode.AccessTokenNotExist);
        }else{
            if(list!=null){
                return new BaseResponse(StatusCode.Success,list);
            }else{
                return new BaseResponse(StatusCode.Fail,"失败！");
            }
        }
    }
//    获取所有车品牌
    @RequestMapping("getCarList")
    public BaseResponse getCarList(){
        List<CarBrand> list=carService.getCarList();
        HashMap<String,Object> map=new HashMap<String,Object>();
        if(list!=null){
            for (CarBrand carBrand : list) {
                map.put(carBrand.getCarBrandPyFirstLetter(),carService.getCarListByLetter(carBrand.getCarBrandPyFirstLetter()));
            }

            return new BaseResponse(StatusCode.Success,map);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败！");
        }
    }
//    搜索车品牌
    @RequestMapping("searchCarList")
    public BaseResponse searchCarList(String name){
        List<CarBrand> list=carService.searchCarList(name);
        System.out.println(list);
        if(list!=null){
            return new BaseResponse(StatusCode.Success,list);
        }else{
            return new BaseResponse(StatusCode.Fail,"失败！");
        }
    }


}
