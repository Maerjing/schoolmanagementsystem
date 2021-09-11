package com.wang.controller;

import com.wang.pojo.Teacher;
import com.wang.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class TeacherController {

    @Autowired
    TeacherServiceImpl teacherService;
    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/selectTeacher")
    @ResponseBody
    public List<Teacher> selectTeacher() {
        List<Teacher> teachers = teacherService.selectAll();
        redisTemplate.expire("selectAll::SimpleKey []",5, TimeUnit.SECONDS);
        return teachers ;
    }
}
