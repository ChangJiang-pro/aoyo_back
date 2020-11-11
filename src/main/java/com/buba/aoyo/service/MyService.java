package com.buba.aoyo.service;

import com.buba.aoyo.pojo.AoyoCoupon;
import com.buba.aoyo.pojo.AoyoCustomLicense;
import com.buba.aoyo.response.BaseResponse;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface MyService {
    List<AoyoCoupon> getCustomAllowReceiveCouponList();

    BaseResponse receiveCoupon(Integer id, Integer classId, HttpServletRequest request) throws Exception;

    BaseResponse getCouponListByStatus(Integer id);

    BaseResponse saveCustomLicense(AoyoCustomLicense param,HttpServletRequest request);

    AoyoCustomLicense getCustomLicenseById(Integer customId);
}
