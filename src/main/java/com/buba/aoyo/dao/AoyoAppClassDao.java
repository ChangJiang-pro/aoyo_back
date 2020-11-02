package com.buba.aoyo.dao;

import com.buba.aoyo.entity.AoyoAppClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AoyoAppClassDao {
    List<AoyoAppClass> findAoyoAppClass();
}
