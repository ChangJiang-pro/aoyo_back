package com.buba.aoyo.service.impl;

import com.buba.aoyo.mapper.CarMapper;
import com.buba.aoyo.pojo.CarBrand;
import com.buba.aoyo.pojo.CarBrandHot;
import com.buba.aoyo.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Resource
    private CarMapper carMapper;

    @Override
    public List<CarBrandHot> getHotCarList() {
        return carMapper.getHotCarList();
    }

    @Override
    public List<CarBrand> getCarList() {
        return carMapper.getCarList();
    }

    @Override
    public List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter) {
        return carMapper.getCarListByLetter(carBrandPyFirstLetter);
    }

    @Override
    public List<CarBrand> searchCarList(String name) {
        return carMapper.searchCarList(name);
    }
}
