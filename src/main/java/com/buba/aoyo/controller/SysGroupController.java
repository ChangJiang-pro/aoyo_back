package com.buba.aoyo.controller;

import com.buba.aoyo.pojo.*;
import com.buba.aoyo.service.SysGroupService;
import com.buba.aoyo.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sys")
public class SysGroupController {
    @Autowired
    SysGroupService sysGroupService;
    //门店首页
    @RequestMapping("/findAll")
    public BaseResponse<SysGroupController> findAll(){

        List<SysGroup> list=sysGroupService.findAll();

        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }

    //门店商品展示
    @RequestMapping("/findAll2")
    public BaseResponse<SysGroupController> findAll2(Mendian mendian){
        List<Mendian> list=sysGroupService.findAll2(mendian);

        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }

    //店铺图片+店铺名称
    @RequestMapping("/findById/{groupId}")
    public BaseResponse<SysGroupController> findById(@PathVariable Integer groupId){
        Xiangqing list=sysGroupService.findById(groupId);
        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }

    //店铺详情
    @RequestMapping("/findById2/{groupId}")
    public BaseResponse<SysGroupController> findById2(@PathVariable Integer groupId){
        Xiangqing list=sysGroupService.findById2(groupId);
        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }

    //分类筛选列表
    @RequestMapping("/findAll3")
    public BaseResponse<SysGroupController> findAll3(){

        List<AoyoCommodityClass> list=sysGroupService.findAll3();

        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }

    //商品详情
    @RequestMapping("/findAll4")
    public BaseResponse<SysGroupController> findAll4(Integer commodityId){

        List<Shangpin> list=sysGroupService.findAll4(commodityId);

        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }
}
