package com.buba.aoyo.service;

import com.buba.aoyo.pojo.CarBrand;
import com.buba.aoyo.pojo.CarBrandHot;

import java.util.List;

public interface CarService {
    List<CarBrandHot> getHotCarList();

    List<CarBrand> getCarList();

    List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter);

    List<CarBrand> searchCarList(String name);
}
