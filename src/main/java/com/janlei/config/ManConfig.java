package com.janlei.config;

import com.janlei.model.Country;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import javax.naming.ldap.Control;

@Configuration      //声明配置类
@ComponentScan(value = "com.janlei",
//        excludeFilters = {
//        @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Bean.class})
//}
        includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Bean.class}),
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        },useDefaultFilters = false

)        //指定扫描的包
public class ManConfig {

    @Bean //给容器注入一个bean;id默认是方法名
    public Country Country(){
        return new Country(1,"美国","US");
    }
}
