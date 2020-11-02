package com.buba.aoyo.pojo;


import lombok.Data;

import java.util.List;

@Data
public class SysGroup {

  private Integer groupId;


  private String areaName;
  private String groupTypeName;
  private String streetName;
  private String distanceNow;
  private String cityName;
  private String groupStatusName;
  private String groupName;
  private Double groupLatitude;
  private Integer orderCount;
  private String provinceName;
  private String groupNickName;
  private String groupAddressDetails;
  private Integer groupScore;
  private Double groupLongitude;

  private List<AoyoGroupFeaturedServices> services;
  private AoyoGroupIndex groupIndex;



}
