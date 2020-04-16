package com.janlei.config;

import com.janlei.model.Country;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class SingleConfigTest {

    @Test
    public void getResource(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingleConfig.class);
        //getBeanByBeanId
        Country country = (Country)context.getBean("country");
        Country c2 = (Country)context.getBean("country");
        //isSingle
        assertEquals(country,c2);
    }

}