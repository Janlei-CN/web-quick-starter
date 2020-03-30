package com.janlei.controller;

import com.janlei.model.entity.User;
import com.janlei.service.intf.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController         //@Controller+@ResponseBody
public class BaseCtlr {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{id}")
    public String  getUser(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        return user.toString();
    }

}
