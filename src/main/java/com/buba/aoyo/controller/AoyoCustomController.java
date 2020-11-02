package com.buba.aoyo.controller;

import com.buba.aoyo.dao.AoyoCustomDao;
import com.buba.aoyo.entity.AoyoCustom;
import com.buba.aoyo.utils.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("AoyoCustomController")
@Slf4j
public class AoyoCustomController {
    @Resource
    AoyoCustomDao aoyoCustomDao;

    @RequestMapping("findAoyoCustom")
    public JsonData findAoyoCustom(@RequestParam("customId") Integer customId){
        log.info("123");
        try {
            AoyoCustom aoyoCustom = aoyoCustomDao.findById(customId);
            return new JsonData(200,"查询成功",aoyoCustom);
        }catch (Exception e){
            return new JsonData(1,"查询失败");
        }
    }

    @RequestMapping("findAoyoCustomURL")
    public JsonData findAoyoCustomURL(){
        log.info("123");
       try{
           List<AoyoCustom> aoyoCustomList = aoyoCustomDao.findAllURL();
           return new JsonData(200,"查询成功",aoyoCustomList);
       }catch (Exception e){
return new JsonData(1,"失败");
       }
    }
}
