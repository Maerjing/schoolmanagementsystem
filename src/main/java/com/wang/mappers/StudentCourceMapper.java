package com.wang.mappers;

import com.wang.pojo.StudentCource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentCourceMapper {
    int insert(StudentCource record);

    List<StudentCource> selectAll();
}