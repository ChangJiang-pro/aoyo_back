package com.buba.aoyo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class dingDanJiHe {


    private Integer orderId;
    private Integer groupId;
    private String orderCode;
    private Integer commodityId;
    private Integer customId;
    private Integer sendOrderStatus;
    private Integer payChannel;
    private double orderAmount;
    private Integer couponId;
    private double discountAmount;
    private double freightAmount;
    private double orderPracticalAmount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderInputTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderSettlementTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderDeliveryTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderReceivingTime;
    private Integer invoiceState;
    private String orderPayNumber;
    private Integer addressId;
    private String trackingNumber;
    private Integer groupEnjoy;
    private Integer groupOrderReceiving;
    private Integer recordDateId;
    private Integer deleteFlag;

    private String commodityNumber;
    private String commodityName;
    private Integer brandId;
    private Integer typeId;
    private double commdityWeight;
    private double commoditySellingPrice;
    private double commodityCostPrice;
    private Integer commodityStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date commodityComeOutTime;
    private String commodityDesc;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date commodityEntry;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date commodityLastupdateTime;
    private Integer commoditySort;

    private Integer groupParentId;
    private Integer groupType;
    private Integer groupLevel;
    private Integer groupCreatorGroupId;
    private Integer countyId;
    private Integer groupStatus;
    private String groupName;
    private String groupDesc;
    private String groupCreator;
    private java.sql.Timestamp groupCreateTime;
    private java.sql.Timestamp groupUpdateTime;
    private String groupTel;
    private String groupLeader;
    private String groupLeaderTel;
    private String groupAddress;
    private String groupIntegeritude;
    private String groupLatitude;
    private String groupCodeImage;
    private Integer groupCode;
    private String groupBank;
    private String groupBankAccount;
    private String groupLeaderAccount;
    private String groupIcon;
    private Integer groupSaleId;
    private String groupImg;
    private Integer cardId;
    private Integer loginFlag;
    private Integer showFlag;
    private Integer etcFlag;
    private String groupEncode;
    private String groupAlias;
    private Integer parentPayStatus;
    private java.sql.Timestamp deleteTime;
    private String deleteDesc;
    private Integer deleteUserId;
    private String deleteUserName;
    private String groupRoadName;
    private String groupCodeNum;
    private String groupLegalPersonImgJust;
    private String groupLegalPersonImgBack;
    private String certificatesImgurlOne;
    private String certificatesImgurlTwo;
    private Integer certificatesStatus;
    private double groupIncomeRatio;
    private Integer groupAddressId;

    private String nickname;
    private String name;
    private String photo;
    private String mobile;
    private String wxPubOpenid;
    private String wxUnionid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;
    private Integer statusId;
    private String wxAppletOpenid;
    private Integer customOriginId;



    private String consigneeName;
    private Integer addressLabelId;
    private String telephone;
    private Integer provinceId;
    private Integer cityId;
    private Integer streetId;
    private String addressDetails;
    private String postcode;
    private Integer addressStatus;
    private Integer defaultAddress;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date creatTime;



}
