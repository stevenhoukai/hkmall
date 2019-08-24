package com.hk.hkmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hk.hkmall.mapper")
@EnableDubbo
public class HkmallManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HkmallManagerServiceApplication.class, args);
    }

}
