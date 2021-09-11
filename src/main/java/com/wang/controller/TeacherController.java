package com.wang.controller;

import com.wang.pojo.Teacher;
import com.wang.service.impl.TeacherServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@Slf4j
public class TeacherController {

    @Autowired
    TeacherServiceImpl teacherService;
    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/")
    public String toLogin(){
        return "login";
    }

    @PostMapping("/toLogin")
    @ResponseBody
    public String login(@RequestParam("id") int id,
                        @RequestParam("name") String name,
                        HttpSession httpSession){
        Teacher teacher = new Teacher(id, name);
        log.info("id=====",id);
        httpSession.setAttribute("teacher",teacher);
        return teacher.toString();
    }

    @GetMapping("/selectTeacher")
    @ResponseBody
    public List<Teacher> selectTeacher() {
        List<Teacher> teachers = teacherService.selectAll();
        redisTemplate.expire("selectAll::SimpleKey []",5, TimeUnit.SECONDS);
        return teachers ;
    }
}
