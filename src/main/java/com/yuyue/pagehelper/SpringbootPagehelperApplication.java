package com.yuyue.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yuyue.pagehelper.mapper")
public class SpringbootPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPagehelperApplication.class, args);
    }

}
