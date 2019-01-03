package com.project.springcloud.demo.provide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.springcloud.demo.provide.dao")
public class DemoProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProvideApplication.class, args);
    }

}