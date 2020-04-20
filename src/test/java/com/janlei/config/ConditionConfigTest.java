package com.janlei.config;

import com.janlei.model.Country;
import com.janlei.model.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

import static org.junit.Assert.*;

public class ConditionConfigTest {

    @Test
    public void testCondition(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ManConfig.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        //获取ioc环境
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //获取操作系统名称
        String property = environment.getProperty("os.name");
        System.out.println(environment);
        for (String name:
                beanNamesForType) {
            System.out.println(name);
        }
        Map<String, Person> personMap = applicationContext.getBeansOfType(Person.class);
        System.out.println(personMap);
    }

}