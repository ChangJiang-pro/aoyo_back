package com.buba.aoyo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//普通会员用户
public class AoyoCustom {
    private Integer customId;//用户id
    private String nickname;//会员昵称
    private String name;//用户名称
    private String photo;//头像地址
    private String mobile;//手机号
    private String wxPubOpenid;//微信openid
    private String wxUnionid;//微信unionid
    private Date createTime;//创建时间
    private Date updateTime;//最后修改时间
    private String deleteDesc;//删除描述
    private Integer statusId;//用户状态
    private Integer deleteFlag;//删除标识符号（默认1）  1：有效，0：无效
    private Integer wxAppletOpenid;//小程序openid
    private Integer customOriginId;//用户来源id
}
