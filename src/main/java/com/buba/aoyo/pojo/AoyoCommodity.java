package com.buba.aoyo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class AoyoCommodity {

  private Integer commodityId;
  private String commodityNumber;
  private String commodityName;
  private Integer brandId;
  private Integer typeId;
  private Integer groupId;
  private double commdityWeight;
  private double commoditySellingPrice;
  private double commodityCostPrice;
  private Integer commodityStatus;
  private Date commodityComeOutTime;
  private String commodityDesc;
  private Date commodityEntry;
  private Date commodityLastupdateTime;
  private Integer commoditySort;
  private Integer deleteFlag;

}
