package com.buba.aoyo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class AuthToken {
    private Integer id;
    //用户id
    private Integer userId;
    //成功token
    private String accessToken;
    //过期时间
    private Long accessExpire;
    //时间戳
    private Long tokenTimestamp;
    //是否有效
    private Byte isActive=1;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;
}
