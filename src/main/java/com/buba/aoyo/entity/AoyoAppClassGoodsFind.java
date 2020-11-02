package com.buba.aoyo.entity;

import lombok.Data;

@Data
public class AoyoAppClassGoodsFind {
    private String query;
    private Integer appClassId;
    private Integer pagenum;
    private Integer pagesize;
}
