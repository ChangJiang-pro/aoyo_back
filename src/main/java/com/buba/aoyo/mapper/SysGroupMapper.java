package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.AoyoGroupIndex;
import com.buba.aoyo.pojo.Mendian;
import com.buba.aoyo.pojo.SysGroup;
import com.buba.aoyo.pojo.Xiangqing;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface SysGroupMapper {

     //门店首页查询
     List<SysGroup> findAll();
     //门店商品展示
     List<Mendian> findAll2(Mendian mendian);
     //门店图片、名称
     Xiangqing findById(Integer groupId);
     //店铺详情
     Xiangqing findById2(Integer groupId);


}
