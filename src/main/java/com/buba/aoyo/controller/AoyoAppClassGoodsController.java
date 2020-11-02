package com.buba.aoyo.controller;

import com.buba.aoyo.dao.AoyoAppClassGoodsDao;
import com.buba.aoyo.entity.AoyoAppClassGoods;
import com.buba.aoyo.entity.AoyoAppClassGoodsFind;
import com.buba.aoyo.utils.JsonData;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("AoyoAppClassGoodsController")
public class AoyoAppClassGoodsController {
    @Resource
    private AoyoAppClassGoodsDao aoyoAppClassGoodsDao;
    /**
     * 商品
     */
    @RequestMapping("findAllByAppClassId")
    private JsonData findAllByAppClassId(AoyoAppClassGoodsFind aoyoAppClassGoodsFind, @RequestParam("appClassId") Integer appClassId, @RequestParam(value = "pagenum") Integer limit, @RequestParam("pagesize")Integer page){
        PageHelper.startPage(aoyoAppClassGoodsFind.getPagesize(), aoyoAppClassGoodsFind.getPagenum());
        List<AoyoAppClassGoods> aoyoAppClassGoodsList = aoyoAppClassGoodsDao.findAllByAppClassId(aoyoAppClassGoodsFind.getAppClassId());
        PageInfo pageInfo=new PageInfo(aoyoAppClassGoodsList);
        return new JsonData(200,"成功",pageInfo.getTotal(),pageInfo.getList());
    }
}
