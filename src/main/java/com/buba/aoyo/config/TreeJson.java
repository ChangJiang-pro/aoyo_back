package com.buba.aoyo.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeJson {
    private long appClassId;
    private long appClassPid;
    private String appClassName;
    private Date createTime;
    private String appClassIcon;
    private long appClassStatus;
    private long deleteFlag;
    private List<TreeJson> children = new ArrayList<>();

    public TreeJson(long appClassId, long appClassPid, String appClassName, Date createTime, String appClassIcon, long appClassStatus, long deleteFlag) {
        this.appClassId = appClassId;
        this.appClassPid = appClassPid;
        this.appClassName = appClassName;
        this.createTime = createTime;
        this.appClassIcon = appClassIcon;
        this.appClassStatus = appClassStatus;
        this.deleteFlag = deleteFlag;
    }
}
