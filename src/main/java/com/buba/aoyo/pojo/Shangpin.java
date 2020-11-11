package com.buba.aoyo.pojo;

import java.util.List;

public class Shangpin {
    private Integer commodityId;
    private Integer commoditCommentContent;
    private String commodityName;
    private double commoditySellingPrice;
    private Integer groupId;
    private String commodityNumber;
    List<Imgs> imgs;
    List<AoyoCommodityNorms> norms;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }


    public Integer getCommoditCommentContent() {
        return commoditCommentContent;
    }

    public void setCommoditCommentContent(Integer commoditCommentContent) {
        this.commoditCommentContent = commoditCommentContent;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public double getCommoditySellingPrice() {
        return commoditySellingPrice;
    }

    public void setCommoditySellingPrice(double commoditySellingPrice) {
        this.commoditySellingPrice = commoditySellingPrice;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(String commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public List<Imgs> getImgs() {
        return imgs;
    }

    public void setImgs(List<Imgs> imgs) {
        this.imgs = imgs;
    }

    public List<AoyoCommodityNorms> getNorms() {
        return norms;
    }

    public void setNorms(List<AoyoCommodityNorms> norms) {
        this.norms = norms;
    }
}
