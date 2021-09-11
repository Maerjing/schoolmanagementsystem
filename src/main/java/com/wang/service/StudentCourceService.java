package com.wang.service;

import com.wang.pojo.StudentCource;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

import java.util.List;
public interface StudentCourceService {
    int insert(StudentCource record);


    String selectAll();
}