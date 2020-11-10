package com.buba.aoyo.controller;

import com.buba.aoyo.pojo.*;
import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.ImgService;
import com.buba.aoyo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    /*订单全查*/
    @RequestMapping("orderShow")
    @ResponseBody
    public BaseResponse orderShow() {
        List< dingDanJiHe> orderShow = orderService.orderShow();
        System.out.println(orderShow);
        return new BaseResponse(200,"成功",orderShow);
    }
    /*订单已完成*/
    @RequestMapping("orderYiWanCheng")
    @ResponseBody
    public BaseResponse orderYiWanCheng() {
        List< dingDanJiHe> orderYiWanCheng = orderService.orderYiWanCheng();
        System.out.println(orderYiWanCheng);
        return new BaseResponse(200,"成功",orderYiWanCheng);
    }

    /*订单已待支付*/
    @RequestMapping("orderDaiZhiFu")
    @ResponseBody
    public BaseResponse orderDaiZhiFu() {
        List< dingDanJiHe> orderDaiZhiFu = orderService.orderDaiZhiFu();
        System.out.println(orderDaiZhiFu);
        return new BaseResponse(200,"成功",orderDaiZhiFu);
    }


    /*订单进行中*/
    @RequestMapping("orderJingXIngZhong")
    @ResponseBody
    public BaseResponse orderJingXIngZhong() {
        List< dingDanJiHe> orderJingXIngZhong = orderService.orderJingXIngZhong();
        System.out.println(orderJingXIngZhong);
        return new BaseResponse(200,"成功",orderJingXIngZhong);
    }


    /*订单评价*/
    @RequestMapping("orderDaiPingJia")
    @ResponseBody
    public BaseResponse orderDaiPingJia() {
        List< dingDanJiHe> orderDaiPingJia = orderService.orderDaiPingJia();
        System.out.println(orderDaiPingJia);
        return new BaseResponse(200,"成功",orderDaiPingJia);
    }

}
