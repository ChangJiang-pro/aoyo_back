package com.buba.aoyo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class AoyoCustomLicense {

  private Integer faceId;
  private String faceBirth;
  private Integer faceNum;
  private String faceSex;
  private java.sql.Timestamp backStartDate;
  private String faceNationality;
  private String backIssue;
  private String backUrl;
  private Date backEndDate;
  private String faceName;
  private String faceUrl;
  private String faceAddress;
  private Integer customId;

}
