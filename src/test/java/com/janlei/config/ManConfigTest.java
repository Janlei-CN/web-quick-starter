package com.janlei.config;

import com.janlei.model.Country;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class ManConfigTest {

    @Test
    public void getBean(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManConfig.class);
        Country country = context.getBean(Country.class);
        //Country{id=1, name='美国', referred='US'}
        System.out.println(country);
    }

}