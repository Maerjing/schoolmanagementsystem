package com.wang.service;

import com.wang.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherService {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Integer id);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher record);

    Teacher selectByIdAndName(Map map);
}