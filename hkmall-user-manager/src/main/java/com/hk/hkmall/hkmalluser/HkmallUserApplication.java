package com.hk.hkmall.hkmalluser;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.hk.hkmall.hkmalluser.mapper")
@EnableDubboConfig
public class HkmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HkmallUserApplication.class, args);
    }

}
