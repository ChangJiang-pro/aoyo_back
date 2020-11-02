package com.buba.aoyo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class AoyoGroupFeaturedServices {

  private long featuredServicesId;
  private String functionButtonName;
  private String featuredServicesDesc;
  private String featuredServicesRemarks;
  private long featuredServicesIsenable;
  private long deleteFlag;
  private Date createTime;
  private String functionButtonUrl;
  private String jumpPath;

}
