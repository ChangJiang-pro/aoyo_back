package com.buba.aoyo.service;

import com.buba.aoyo.pojo.*;

import java.util.List;

public interface OrderService {


    List<dingDanJiHe> orderShow();

    List<dingDanJiHe> orderYiWanCheng();

    List<dingDanJiHe> orderDaiZhiFu();

    List<dingDanJiHe> orderJingXIngZhong();

    List<dingDanJiHe> orderDaiPingJia();
}
