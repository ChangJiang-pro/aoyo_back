package com.buba.aoyo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class AoyoAppClass {
  private long appClassId;
  private long appClassPid;
  private String appClassName;
  private Date createTime;
  private String appClassIcon;
  private long appClassStatus;
  private long deleteFlag;
}