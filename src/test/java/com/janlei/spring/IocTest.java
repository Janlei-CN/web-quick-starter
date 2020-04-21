package com.janlei.spring;

import com.janlei.condition.LinuxCondition;
import com.janlei.config.ManConfig;
import com.janlei.model.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IocTest {
    @SuppressWarnings("resource")
    @Test
    public void getResource(){
        //注意未加载使用 会有一个懒加载
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ManConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name:
             names) {
            System.out.println(name);
        }
    }
}
