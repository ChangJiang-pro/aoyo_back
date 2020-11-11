package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.CarBrand;
import com.buba.aoyo.pojo.CarBrandHot;
import com.buba.aoyo.pojo.dingDanJiHe;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    /*订单全查*/
    List<dingDanJiHe> orderShow();

    /*订单已完成*/
    List<dingDanJiHe> orderYiWanCheng();

    /*订单待支付*/
    List<dingDanJiHe> orderDaiZhiFu();

    /*订单进行中*/
    List<dingDanJiHe> orderJingXIngZhong();

    /*订单待支付*/
    List<dingDanJiHe> orderDaiPingJia();
}
