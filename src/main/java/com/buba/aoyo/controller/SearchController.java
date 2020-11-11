package com.buba.aoyo.controller;

import com.buba.aoyo.pojo.Mendian;
import com.buba.aoyo.service.SearchService;
import com.buba.aoyo.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private SearchService searchService;

    @RequestMapping("/findAll")
    public BaseResponse<SysGroupController> findAll(Mendian md){
        List<Mendian> list=searchService.findAll(md);

        BaseResponse<SysGroupController> br=new BaseResponse(1,"success!",list);
        return br;
    }
}
