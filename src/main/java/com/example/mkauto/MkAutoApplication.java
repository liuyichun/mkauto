package com.example.mkauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mkauto.model.mapper")
public class MkAutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MkAutoApplication.class, args);
    }

}
