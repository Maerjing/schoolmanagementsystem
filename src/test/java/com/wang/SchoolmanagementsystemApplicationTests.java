package com.wang;

import com.alibaba.fastjson.JSON;
import com.wang.pojo.StudentCource;
import com.wang.pojo.Teacher;
import com.wang.service.StudentCourceService;
import com.wang.service.impl.TeacherServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
@Slf4j
class SchoolmanagementsystemApplicationTests {
    @Autowired
    StudentCourceService studentCourceService;
    @Autowired
    TeacherServiceImpl teacherService;

    @Test
    void contextLoads() {
        List<Teacher> teachers = teacherService.selectAll();
        System.out.println(teachers);
    }

    @Test
    void test01(){
        String selectAll = studentCourceService.selectAll();
        List<StudentCource> StudentCource = (List<StudentCource>)JSON.parse(selectAll);
        System.out.println(StudentCource);
    }
    @Test
    void test02(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id",4);
        hashMap.put("name","123");
        Teacher teacher = teacherService.selectByIdAndName(hashMap);
        System.out.println(teacher);
    }
}
