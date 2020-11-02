package com.buba.aoyo.dao;

import com.buba.aoyo.entity.AoyoGroupFeaturedServices;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AoyoGroupFeaturedServicesDao {
    List<AoyoGroupFeaturedServices> findAllAoyoGroupFeaturedServices();
}
