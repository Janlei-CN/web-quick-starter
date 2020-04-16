package com.janlei.config;

import com.janlei.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SingleConfig {

    @Bean("country") //默认是单实例
    public Country Country(){
        return new Country(1,"美国","US");
    }
}
