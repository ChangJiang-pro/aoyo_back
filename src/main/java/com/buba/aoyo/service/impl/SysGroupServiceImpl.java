package com.buba.aoyo.service.impl;


import com.buba.aoyo.mapper.SysGroupMapper;
import com.buba.aoyo.pojo.AoyoGroupIndex;
import com.buba.aoyo.pojo.Mendian;
import com.buba.aoyo.pojo.SysGroup;
import com.buba.aoyo.pojo.Xiangqing;
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

}
