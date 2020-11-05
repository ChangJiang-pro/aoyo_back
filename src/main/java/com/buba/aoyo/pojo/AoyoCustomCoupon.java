package com.buba.aoyo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCustomCoupon {
    private Integer couponId;
    private Integer customId;
    private Date createtime;
    private Integer deleteFlag;
    private Integer couponStatusId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date couponEndTime;
    private double couponMinimumAmount;
    private String couponDesc;
    private double couponAmt;
    private String couponName;
    private Integer couponTypeId;
}
