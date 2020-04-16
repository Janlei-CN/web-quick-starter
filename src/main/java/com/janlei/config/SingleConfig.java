package com.janlei.config;

import com.janlei.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SingleConfig {

    //    @Bean("country") //默认是单实例

    /*
    singleton   单例
    prototype   多实例
    request     共用Request
    session     共用session
     */
    @Scope("prototype")
    @Bean("country")
    public Country Country(){
        return new Country(1,"美国","US");
    }
}
