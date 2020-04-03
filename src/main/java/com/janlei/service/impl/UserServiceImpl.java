package com.janlei.service.impl;

import com.janlei.mapper.UserMapper;
import com.janlei.model.User;
import com.janlei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        //return userMapper.insert(user);
        System.out.println("add");
        return 0;
    }

    @Override
    public User findAllUser(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
