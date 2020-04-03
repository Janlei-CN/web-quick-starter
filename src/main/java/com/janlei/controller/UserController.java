package com.janlei.controller;

import com.janlei.cache.MyCache;
import com.janlei.model.User;
import com.janlei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MyCache myCache;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(null);
    }

    @ResponseBody
    @RequestMapping(value = "/find/{userId}", produces = {"application/json;charset=UTF-8"})
    public User findAllUser(@PathVariable("userId") int userId){
        return userService.findAllUser(userId);
    }
}