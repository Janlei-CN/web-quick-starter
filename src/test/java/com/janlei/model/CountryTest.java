package com.janlei.model;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryTest {

    @Test
    public void getBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/country.xml");

        Country country = (Country)context.getBean("country");
        //Country{id=1, name='美国', referred='US'}
        System.out.println(country);
    }
}
