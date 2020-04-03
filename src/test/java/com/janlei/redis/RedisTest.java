package com.janlei.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    //String
    @Test
    public void operString(){
        redisTemplate.opsForValue().set("firstString","testString");
        Object string = redisTemplate.opsForValue().get("firstString");
        System.out.println(string);
        assertEquals("testString",string);
    }

    //map
    @Test
    public void operMap(){}

    //hash
    @Test
    public void operHash(){
        redisTemplate.boundHashOps("h_name").put("name","janlei");

        Set arr = redisTemplate.boundHashOps("h_name").keys();
        for (Object s:
              arr) {

        System.out.println(redisTemplate.boundHashOps("h_name").get(s.toString()));
        }

       // Object value = redisTemplate.boundHashOps("h_name").get(name.toString());

//        System.out.println(value.toString());

    }

    //list
    @Test
    public void operList(){}

    //set
    @Test
    public void operSet(){}

    //sorted  set

    public void operSort(){}

    @Test
    public void getkey(){}

    @Test
    public void delKey(){}
}
