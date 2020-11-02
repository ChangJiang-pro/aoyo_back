package com.buba.aoyo.pojo;

import java.util.List;

public class Xiangqing {
    private Integer groupId;
    private String groupName;
    private String groupDesc;
    private String groupAddressDetails;
    private String imgUrl;
    private String featuredServicesDesc;
    private String groupTypeName;
    private List<AoyoGroupTechnician> aoyoGroupTechnicians;

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

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getGroupAddressDetails() {
        return groupAddressDetails;
    }

    public void setGroupAddressDetails(String groupAddressDetails) {
        this.groupAddressDetails = groupAddressDetails;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getFeaturedServicesDesc() {
        return featuredServicesDesc;
    }

    public void setFeaturedServicesDesc(String featuredServicesDesc) {
        this.featuredServicesDesc = featuredServicesDesc;
    }

    public String getGroupTypeName() {
        return groupTypeName;
    }

    public void setGroupTypeName(String groupTypeName) {
        this.groupTypeName = groupTypeName;
    }

    public List<AoyoGroupTechnician> getAoyoGroupTechnicians() {
        return aoyoGroupTechnicians;
    }

    public void setAoyoGroupTechnicians(List<AoyoGroupTechnician> aoyoGroupTechnicians) {
        this.aoyoGroupTechnicians = aoyoGroupTechnicians;
    }
}
