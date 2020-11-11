package com.buba.aoyo.service.impl;


import com.buba.aoyo.mapper.SysGroupMapper;
import com.buba.aoyo.pojo.*;
import com.buba.aoyo.service.SysGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysGroupServiceImpl implements SysGroupService {
    @Autowired
    SysGroupMapper sysGroupMapper;

    @Override
    public List<SysGroup> findAll() {
        return sysGroupMapper.findAll();
    }

    @Override
    public List<Mendian> findAll2(Mendian mendian) {
        return sysGroupMapper.findAll2(mendian);
    }

    @Override
    public Xiangqing findById(Integer groupId) {
        return sysGroupMapper.findById(groupId);
    }

    @Override
    public Xiangqing findById2(Integer groupId) {
        return sysGroupMapper.findById2(groupId);
    }

    @Override
    public List<AoyoCommodityClass> findAll3() {
        return sysGroupMapper.findAll3();
    }

    @Override
    public List<Shangpin> findAll4(Integer commodityId) {
        return sysGroupMapper.findAll4(commodityId);
    }

}
