package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.AoyoCustom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AoyoCustomDao {
//   根据id查询普通用户信息
    AoyoCustom findById(@Param("customId") Integer customId);
    //   查询URL
    List<AoyoCustom> findAllURL();
}
