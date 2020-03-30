package com.janlei.config;

import com.janlei.intercepter.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //1.注册拦截器
    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }

    //2.添加拦截规则到MVC连接器链
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(myInterceptor()).addPathPatterns("/**").excludePathPatterns("/hi");
    }

}
