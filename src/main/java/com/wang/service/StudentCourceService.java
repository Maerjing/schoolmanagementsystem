package com.wang.service;

import com.wang.pojo.StudentCource;

import java.util.List;

public interface StudentCourceService {
    int insert(StudentCource record);

    List<StudentCource> selectAll();
}