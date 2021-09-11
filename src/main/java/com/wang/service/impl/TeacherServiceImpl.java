package com.wang.service.impl;

import com.wang.mappers.TeacherMapper;
import com.wang.pojo.Teacher;
import com.wang.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Teacher record) {
        return 0;
    }

    @Override
    public Teacher selectByPrimaryKey(Integer id) {
        return null;
    }

    @Cacheable(value = "selectAll")
    @Override
    public List<Teacher> selectAll() {
        List<Teacher> teachers = teacherMapper.selectAll();
        return teachers;
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return 0;
    }
}