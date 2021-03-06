package com.wang.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.ISelect;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wang.mappers.StudentCourceMapper;
import com.wang.pojo.Cource;
import com.wang.pojo.StudentCource;
import com.wang.service.StudentCourceService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;

@Service
@EnableCaching
public class StudentCourceServiceImpl implements StudentCourceService {
    @Autowired
    StudentCourceMapper studentCourceMapper;


    @Override
    public int insert(StudentCource record) {
        return 0;
    }

    @Override
    @Cacheable("StudentC")
    public String selectAll() {
        List<StudentCource> studentCources = studentCourceMapper.selectAll();
        String jsonString = JSON.toJSONString(studentCources);
        return jsonString;
    }
}