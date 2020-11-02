package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.AoyoGroupFeaturedServices;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AoyoGroupFeaturedServicesDao {
    List<AoyoGroupFeaturedServices> findAllAoyoGroupFeaturedServices();
}
