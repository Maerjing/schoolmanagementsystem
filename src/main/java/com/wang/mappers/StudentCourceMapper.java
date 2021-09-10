package com.wang.mappers;

import com.wang.pojo.StudentCource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
public interface StudentCourceMapper {
    int insert(StudentCource record);

    List<StudentCource> selectAll();
}