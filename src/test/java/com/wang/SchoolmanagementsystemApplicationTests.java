package com.wang;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wang.mappers.CourceMapper;
import com.wang.pojo.Cource;
import com.wang.pojo.StudentCource;
import com.wang.pojo.Teacher;
import com.wang.service.StudentCourceService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
@Slf4j
class SchoolmanagementsystemApplicationTests {
    @Autowired
    StudentCourceService studentCourceService;

    @Autowired
    CourceMapper courceMapper;

    @Test
    void contextLoads() {
        Page<StudentCource> page = PageHelper.startPage(0, 5);
        List<StudentCource> studentCources = studentCourceService.selectAll();
        for (StudentCource studentCource : studentCources) {
            System.out.println(studentCource);
        }
        PageInfo<StudentCource> pageInfo = new PageInfo<StudentCource>(studentCources);
        long total = pageInfo.getTotal();
        List<StudentCource> list = pageInfo.getList();
        for (StudentCource studentCource : list) {
            System.out.println(studentCource);
        }
        int row = pageInfo.getEndRow();
        System.out.println(total);
        System.out.println(row);

//        List<Cource> cources = courceMapper.selectAll();
//        for (Cource cource : cources) {
//            System.out.println(cource);
//        }
    }

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void redisTest(){
        Teacher teacher = new Teacher(1, "zhu");
        redisTemplate.opsForValue().set("k2",teacher);
        System.out.println(redisTemplate.opsForValue().get("k2"));
    }
}
