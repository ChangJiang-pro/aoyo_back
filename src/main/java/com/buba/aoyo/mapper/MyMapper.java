package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoCustomCoupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyMapper {
    List<AoyoCoupon> getCustomAllowReceiveCouponList();

    int updateCoupon(@Param("id") Integer id);

    int insCouponCustom(@Param("id") Integer id, @Param("customId") Integer customId);

    List<AoyoCustomCoupon> getCouponListByStatus(@Param("id") Integer id);
}
