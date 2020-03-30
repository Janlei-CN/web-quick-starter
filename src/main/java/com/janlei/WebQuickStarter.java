package com.janlei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * SpringBoot 启动引导类
 */
//@MapperScan("com.janlei.mapper")    //scan Mapper when application start
@MapperScan(basePackages = "com.janlei.mapper")
@SpringBootApplication
public class WebQuickStarter {
    public static void main(String[] args) {

        //SpringBoot init start
        SpringApplication.run(WebQuickStarter.class,args);
    }
}
