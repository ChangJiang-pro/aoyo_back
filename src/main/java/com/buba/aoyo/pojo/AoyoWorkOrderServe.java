package com.buba.aoyo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class AoyoWorkOrderServe {

  private long workOrderServeId;
  private long workOrderId;
  private long groupId;
  private long technicianId;
  private long commodityId;
  private long commodityTypeId;
  private String commodityName;
  private double commodityPrice;
  private String workOrderServeRemark;
  private Date creatTime;
  private long deleteFlag;



}
