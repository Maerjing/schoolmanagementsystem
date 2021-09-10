package com.wang.service;

import com.wang.pojo.Cource;

import java.util.List;

public interface CourceService {
    int deleteByPrimaryKey(Integer id);

    int insert(Cource record);

    Cource selectByPrimaryKey(Integer id);

    List<Cource> selectAll();

    int updateByPrimaryKey(Cource record);
}
