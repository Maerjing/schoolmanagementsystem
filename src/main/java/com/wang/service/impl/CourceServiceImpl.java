package com.wang.service.impl;

import com.wang.pojo.Cource;
import com.wang.service.CourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourceServiceImpl implements CourceService {
    @Autowired
    CourceService courceService;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Cource record) {
        return 0;
    }

    @Override
    public Cource selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Cource> selectAll() {
        return courceService.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Cource record) {
        return 0;
    }
}
