package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication

public class SchoolmanagementsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolmanagementsystemApplication.class, args);
    }

}
