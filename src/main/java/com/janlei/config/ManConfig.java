package com.janlei.config;

import com.janlei.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration      //声明配置类
public class ManConfig {

    @Bean //给容器注入一个bean;id默认是方法名
    public Country Country(){
        return new Country(1,"美国","US");
    }
}
