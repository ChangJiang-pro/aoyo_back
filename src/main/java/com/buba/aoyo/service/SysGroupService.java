package com.buba.aoyo.service;

import com.buba.aoyo.pojo.*;

import java.util.List;

public interface SysGroupService {
    List<SysGroup> findAll();

    List<Mendian> findAll2(Mendian mendian);

    Xiangqing findById(Integer groupId);

    Xiangqing findById2(Integer groupId);

    List<AoyoCommodityClass> findAll3();

    List<Shangpin> findAll4(Integer commodityId);
}
