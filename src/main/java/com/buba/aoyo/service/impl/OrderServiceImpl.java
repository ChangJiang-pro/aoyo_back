package com.buba.aoyo.service.impl;

import com.buba.aoyo.mapper.ImgMapper;
import com.buba.aoyo.mapper.OrderMapper;
import com.buba.aoyo.pojo.*;
import com.buba.aoyo.service.ImgService;
import com.buba.aoyo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;


    @Override
    public List<dingDanJiHe> orderShow() {
        return orderMapper.orderShow();
    }

    @Override
    public List<dingDanJiHe> orderYiWanCheng() {
        return orderMapper.orderYiWanCheng();
    }

    @Override
    public List<dingDanJiHe> orderDaiZhiFu() {
        return orderMapper.orderDaiZhiFu();
    }

    @Override
    public List<dingDanJiHe> orderJingXIngZhong() {
        return orderMapper.orderJingXIngZhong();
    }

    @Override
    public List<dingDanJiHe> orderDaiPingJia() {
        return orderMapper.orderDaiPingJia();
    }
}
