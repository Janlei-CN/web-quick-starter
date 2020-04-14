package com.janlei.service;

import com.janlei.mapper.UserMapper;
import com.janlei.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Test
    @Transactional
    public void addUser() {
        //return userMapper.insert(user);
        System.out.println("add");
    }

    @Test
    @Transactional
    public void findAllUser() {
        User user = new User();
        user.setUserId(23465433);
        user.setUserName("zhangsan");
        user.setPassword("efbkjfhlejfpe");
        user.setPhone("11234567890");
        Integer userId = 23465433;
        User user2 = userMapper.selectByPrimaryKey(userId);
        assertEquals(user,user2);
    }
}