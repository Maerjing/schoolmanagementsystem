package com.wang.controller;

import com.wang.pojo.StudentCource;
import com.wang.pojo.Teacher;
import com.wang.service.StudentCourceService;
import com.wang.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCourceController {

    @Autowired
    StudentCourceService studentCourceService;

    @Autowired
    TeacherServiceImpl teacherService;

    @GetMapping("/selectAll")
    public List<Teacher> selectAll(){
        List<Teacher> teachers = teacherService.selectAll();
        return teachers;
    }
}
