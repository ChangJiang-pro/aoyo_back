package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SysGroupMapper {
     //门店首页
     List<SysGroup> findAll();
    //门店商品展示
     List<Mendian> findAll2(Mendian mendian);
    //店铺图片+店铺名称
     Xiangqing findById(Integer groupId);
    //店铺详情
     Xiangqing findById2(Integer groupId);
    //分类筛选列表
     List<AoyoCommodityClass> findAll3();
    //商品详情
     List<Shangpin> findAll4(Integer commodityId);


}
