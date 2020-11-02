package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.AoyoAppClassGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AoyoAppClassGoodsDao {
    List<AoyoAppClassGoods> findAllByAppClassId(@Param("appClassId") Integer appClassId);
}
