package com.janlei;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 启动引导类
 */
@SpringBootApplication
@MapperScan("com.janlei.mapper")
public class WebQuickStarter {
    public static void main(String[] args) {

        //SpringBoot init start
        SpringApplication.run(WebQuickStarter.class,args);
    }
}
