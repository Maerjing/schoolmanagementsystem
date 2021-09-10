package com.wang;

import com.wang.pojo.Teacher;
import com.wang.service.StudentCourceService;
import com.wang.service.impl.TeacherServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest
@Slf4j
class SchoolmanagementsystemApplicationTests {
    @Autowired
    StudentCourceService studentCourceService;
    @Autowired
    TeacherServiceImpl teacherService;

    @Test
    @PerfTest(invocations = 10000, threads = 1000)
    void contextLoads() {
        List<Teacher> teachers = teacherService.selectAll();
        System.out.println(teachers);
    }

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void test01() {
        Teacher teacher = new Teacher(1, "zhu");
        redisTemplate.opsForValue().set("teacher", teacher);
        System.out.println(redisTemplate.opsForValue().get("teacher"));
    }
}
