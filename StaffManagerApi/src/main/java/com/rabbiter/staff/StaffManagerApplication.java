package com.rabbiter.staff;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rabbiter")
@MapperScan("com.rabbiter.staff.mapper")
public class StaffManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffManagerApplication.class, args);
    }

}
