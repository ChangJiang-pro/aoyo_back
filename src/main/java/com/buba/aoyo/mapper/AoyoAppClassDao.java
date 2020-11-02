package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.AoyoAppClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AoyoAppClassDao {
    List<AoyoAppClass> findAoyoAppClass();
}
