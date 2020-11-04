package com.buba.aoyo.pojo;


public class AoyoCommodityNorms {

  private Integer normsId;
  private Integer commodityId;
  private Integer groupId;
  private Integer classId;
  private String normsName;
  private String normsValue;
  private Integer deleteFlag;


  public Integer getNormsId() {
    return normsId;
  }

  public void setNormsId(Integer normsId) {
    this.normsId = normsId;
  }

  public Integer getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(Integer commodityId) {
    this.commodityId = commodityId;
  }

  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public Integer getClassId() {
    return classId;
  }

  public void setClassId(Integer classId) {
    this.classId = classId;
  }

  public String getNormsName() {
    return normsName;
  }

  public void setNormsName(String normsName) {
    this.normsName = normsName;
  }

  public String getNormsValue() {
    return normsValue;
  }

  public void setNormsValue(String normsValue) {
    this.normsValue = normsValue;
  }

  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
