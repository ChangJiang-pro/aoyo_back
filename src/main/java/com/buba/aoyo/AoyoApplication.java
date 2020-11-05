package com.buba.aoyo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.buba.aoyo.mapper")
//123
public class AoyoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AoyoApplication.class, args);
    }

}
