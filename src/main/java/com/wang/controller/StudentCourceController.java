package com.wang.controller;

import com.wang.pojo.StudentCource;
import com.wang.service.StudentCourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentCourceController {

    @Autowired
    StudentCourceService studentCourceService;

    @GetMapping("/selectAll")
    public List<StudentCource> selectAll(){
        List<StudentCource> studentCources = studentCourceService.selectAll();
        return studentCources;
    }
}
