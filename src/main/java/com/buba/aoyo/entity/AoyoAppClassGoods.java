package com.buba.aoyo.entity;

import java.io.Serializable;
import lombok.Data;
import java.util.Date;

@Data
public class AoyoAppClassGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 商品id
    */
    private Integer goodsId;

    /**
    * 分类id
    */
    private Integer appclassId;

    /**
    * 商品名称
    */
    private String goodsName;

    /**
    * 价钱
    */
    private String goodsPrice;

    /**
     * 图片
     */
    private String goodImg;

    /**
    * 货号
    */
    private String goodsNumber;

    /**
    * 质量
    */
    private String goodsWeight;

    /**
    * goods_create
    */
    private String goodsCreate;

    /**
    * goods_update
    */
    private Date goodsUpdate;

}