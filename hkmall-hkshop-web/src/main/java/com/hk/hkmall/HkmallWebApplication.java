package com.hk.hkmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class HkmallWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HkmallWebApplication.class, args);
    }

}
