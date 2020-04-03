package com.janlei.controller;

import com.janlei.cache.MyCache;
import com.janlei.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private MyCache myCache;

    @ResponseBody
    @RequestMapping(value = "/find/{userId}", produces = {"application/json;charset=UTF-8"})
    public int test(@PathVariable("userId") Integer userId){

        User msg = myCache.getMsg(userId);
        System.out.println(msg);
        return 0;
    }
}
