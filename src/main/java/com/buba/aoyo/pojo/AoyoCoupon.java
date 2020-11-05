package com.buba.aoyo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCoupon {

  private Integer couponId;
  private String couponNotImgUrl;
  private String couponUsedImgUrl;
  private String couponExpiredImgUrl;
  private String couponName;
  private Integer couponTypeId;
  private String couponDesc;
  private double couponAmt;//优惠券面值
  private String couponJson;
  private Integer couponGroupId;
  private Integer couponTotalCount;
  private Integer couponCustomCount;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date couponStartTime;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date couponEndTime;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date couponCreatTime;
  private String couponStatusId;
  private Integer couponValidId;
  private Integer deleteFlag;
  private Integer couponValidSecond;
  private double couponMinimumAmount;//最低满减


}