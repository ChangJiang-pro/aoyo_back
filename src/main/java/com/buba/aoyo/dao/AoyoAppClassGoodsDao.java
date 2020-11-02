package com.buba.aoyo.dao;

import com.buba.aoyo.entity.AoyoAppClassGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AoyoAppClassGoodsDao {
    List<AoyoAppClassGoods> findAllByAppClassId(@Param("appClassId") Integer appClassId);
}
