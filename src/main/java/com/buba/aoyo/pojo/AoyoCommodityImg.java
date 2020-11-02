package com.buba.aoyo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class AoyoCommodityImg {

  private long commodityImgId;
  private long commodityId;
  private String commodityImgDesc;
  private String commodityImgUrl;
  private long commodityImgIndex;
  private long commodityImgSort;
  private long commodityImgStatus;
  private Date commodityImgLastupdateTime;
  private long deleteFlag;


}
