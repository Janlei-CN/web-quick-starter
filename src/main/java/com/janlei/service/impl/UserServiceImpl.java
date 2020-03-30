package com.janlei.service.impl;

import com.janlei.mapper.UserMapper;
import com.janlei.model.entity.User;
import com.janlei.service.intf.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public boolean saveUser(User user){
        int insert = userMapper.insertSelective(user);
        return true;
    }

    @Transactional
    @Override
    public User getUserById(Integer id) {
        log.info("UserServiceImpl       ->      getUserById");
//        userMapper.getUser(id);
        return userMapper.selectByPrimaryKey(id);
    }
}
