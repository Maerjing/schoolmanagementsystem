package com.wang.mappers;

import com.wang.pojo.Cource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cource record);

    Cource selectByPrimaryKey(Integer id);

    List<Cource> selectAll();

    int updateByPrimaryKey(Cource record);
}