package com.buba.aoyo.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AoyoCoupon {

  private long couponId;
  private String couponNotImgUrl;
  private String couponUsedImgUrl;
  private String couponExpiredImgUrl;
  private String couponName;
  private long couponTypeId;
  private String couponDesc;
  private double couponAmt;
  private String couponJson;
  private long couponGroupId;
  private long couponTotalCount;
  private long couponCustomCount;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date couponStartTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date couponEndTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date couponCreatTime;
  private String couponStatusId;
  private long couponValidId;
  private long deleteFlag;
  private long couponValidSecond;

}
