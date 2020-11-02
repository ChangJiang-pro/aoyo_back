package com.buba.aoyo.controller;

import com.buba.aoyo.config.TreeJson;
import com.buba.aoyo.config.TreeNodeBuilder;
import com.buba.aoyo.mapper.AoyoAppClassDao;
import com.buba.aoyo.pojo.AoyoAppClass;
import com.buba.aoyo.utils.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("AoyoAppClassController")
public class AoyoAppClassController {
    @Resource
    private AoyoAppClassDao aoyoAppClassDao;

    /**
     * 分类
     * @return
     */
    @RequestMapping("findAoyoAppClass")
    private JsonData findAoyoAppClass(){
        List<AoyoAppClass> aoyoAppClass1 = aoyoAppClassDao.findAoyoAppClass();
        ArrayList<TreeJson> treeJsons = new ArrayList<>();
        for (AoyoAppClass aoyoAppClass :aoyoAppClass1){
            long appClassId = aoyoAppClass.getAppClassId();
            long appClassPid = aoyoAppClass.getAppClassPid();
            String appClassName = aoyoAppClass.getAppClassName();
            Date createTime = aoyoAppClass.getCreateTime();
            String appClassIcon = aoyoAppClass.getAppClassIcon();
            long deleteFlag = aoyoAppClass.getDeleteFlag();
            long appClassStatus = aoyoAppClass.getAppClassStatus();
            treeJsons.add(new TreeJson(appClassId,appClassPid,appClassName,createTime,appClassIcon,deleteFlag,appClassStatus));
        }
        List<TreeJson> treeNodeList  = TreeNodeBuilder.build(treeJsons,0);
        return new JsonData(200,"成功",treeNodeList);
    }
}