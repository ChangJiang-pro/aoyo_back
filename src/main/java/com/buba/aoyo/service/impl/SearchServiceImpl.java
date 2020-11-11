package com.buba.aoyo.service.impl;

import com.buba.aoyo.mapper.SearchMapper;
import com.buba.aoyo.pojo.Mendian;
import com.buba.aoyo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchMapper searchMapper;

    @Override
    public List<Mendian> findAll(Mendian md) {
        return searchMapper.findAll(md);
    }
}
