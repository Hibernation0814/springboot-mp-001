package com.lsy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@MapperScan("com.lsy.mapper")
public class SpringbootMp001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMp001Application.class, args);
    }

}
