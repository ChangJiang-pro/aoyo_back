package com.buba.aoyo.service;

import com.buba.aoyo.pojo.AoyoGroupIndex;
import com.buba.aoyo.pojo.Mendian;
import com.buba.aoyo.pojo.SysGroup;
import com.buba.aoyo.pojo.Xiangqing;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SysGroupService {
    List<SysGroup> findAll();

    List<Mendian> findAll2(Mendian mendian);

    Xiangqing findById(Integer groupId);

    Xiangqing findById2(Integer groupId);
}
