package com.buba.aoyo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class SysUser {

  private Integer userId;
  private long groupId;
  private long roleId;
  private String userName;
  private String userPwd;
  private String userAlias;
  private String userTel;
  private String userWeixin;
  private String userQq;
  private String userEmail;
  private String userIdentity;
  private long userAddressId;
  private String userImagePath;
  private long countyId;
  private String userMac;
  private String userImei;
  private String userToken;
  private long loginFlag;
  private String loginDesc;
  private Date userLastLogin;
  private String loginUser;
  private long userSource;
  private String userCreator;
  private Date userCreateTime;
  private Date userUpdateTime;
  private String userWxOpenid;
  private String userWxUnionid;
  private long workStart;
  private long workEnd;
  private long childrenAccountId;
  private long userStatus;
  private long userFlag;
  private long userSex;
  private String userWeixinName;


}