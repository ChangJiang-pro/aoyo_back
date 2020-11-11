package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.Mendian;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchMapper {

    List<Mendian> findAll(Mendian md);
}
