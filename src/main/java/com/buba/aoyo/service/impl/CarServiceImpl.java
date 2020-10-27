package com.buba.aoyo.service.impl;

import com.buba.aoyo.mapper.CarMapper;
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
}
