package com.buba.aoyo.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
public class AoyoCustom {

  private Integer customId;
  private String nickname;
  private String name;
  private String photo;
  private String mobile;
  private String wxPubOpenid;
  private String wxUnionid;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updateTime;
  private String deleteDesc;
  private long statusId;
  private long deleteFlag;
  private String wxAppletOpenid;
  private long customOriginId;



}
