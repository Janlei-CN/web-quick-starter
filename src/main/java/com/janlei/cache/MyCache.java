package com.janlei.cache;

import com.janlei.model.User;
import com.janlei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCache {

    @Autowired
    private UserService userService;

    public User getMsg(Integer userId){
        return userService.findAllUser(userId);
    }

}
