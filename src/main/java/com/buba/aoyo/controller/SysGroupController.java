package com.buba.aoyo.controller;

import com.buba.aoyo.pojo.AoyoGroupIndex;
import com.buba.aoyo.pojo.Mendian;
import com.buba.aoyo.pojo.SysGroup;
import com.buba.aoyo.pojo.Xiangqing;
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

    @RequestMapping("/findAll")
    public  BaseResponse<SysGroupController> findAll(){

        List<SysGroup> list=sysGroupService.findAll();

        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }

    @RequestMapping("/findAll2")
    public BaseResponse<SysGroupController> findAll2(Mendian mendian){

        List<Mendian> list=sysGroupService.findAll2(mendian);

        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }


    @RequestMapping("/findById{groupId}")
    public BaseResponse<SysGroupController> findById(@PathVariable Integer groupId){
        Xiangqing list=sysGroupService.findById(groupId);
        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }

    @RequestMapping("/findById2{groupId}")
    public BaseResponse<SysGroupController> findById2(@PathVariable Integer groupId){
        Xiangqing list=sysGroupService.findById2(groupId);
        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);

        return br;
    }
}
