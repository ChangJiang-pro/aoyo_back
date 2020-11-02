package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.CarBrand;
import com.buba.aoyo.pojo.CarBrandHot;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {

    List<CarBrandHot> getHotCarList();

    List<CarBrand> getCarList();

    List<CarBrand> getCarListByLetter(String carBrandPyFirstLetter);

    List<CarBrand> searchCarList(@Param("name") String name);
}
