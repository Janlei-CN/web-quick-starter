package com.janlei.config;

import com.janlei.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.janlei")
public class ConditionConfig {

    @Bean("US") //给容器注入一个bean;id默认是方法名
    public Country Country(){
        return new Country(1,"美国","US");
    }

    @Bean("UK")
    public Country country1(){
        return new Country(2,"英国","UK");
    }
}
