package com.janlei.config;

import com.janlei.condition.LinuxCondition;
import com.janlei.condition.WindowsCondition;
import com.janlei.model.Country;
import com.janlei.model.Person;
import org.springframework.context.annotation.*;

@Configuration      //声明配置类
@ComponentScan(value = "com.janlei")//指定扫描的包
public class ManConfig {

    @Conditional({WindowsCondition.class})
    @Bean("bill") //给容器注入一个bean;id默认是方法名
    public Person person01(){
        return new Person("bill",60);

    }

    @Conditional({LinuxCondition.class})
    @Bean("linus") //给容器注入一个bean;id默认是方法名
    public Person person02(){
        return new Person("linus",48);

    }
}
