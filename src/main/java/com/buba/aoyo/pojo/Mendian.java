package com.buba.aoyo.pojo;

public class Mendian {
    private Integer groupId;
    private String groupName;
    private String commodityName;
    private double commodityCostPrice;
    private String commodityImgUrl;

    @Override
    public String toString() {
        return "Mendian{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", commodityCostPrice=" + commodityCostPrice +
                ", commodityImgUrl='" + commodityImgUrl + '\'' +
                '}';
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public double getCommodityCostPrice() {
        return commodityCostPrice;
    }

    public void setCommodityCostPrice(double commodityCostPrice) {
        this.commodityCostPrice = commodityCostPrice;
    }

    public String getCommodityImgUrl() {
        return commodityImgUrl;
    }

    public void setCommodityImgUrl(String commodityImgUrl) {
        this.commodityImgUrl = commodityImgUrl;
    }
}
