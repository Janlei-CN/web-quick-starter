package com.janlei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController         //@Controller+@ResponseBody
public class BaseCtlr {

    @Autowired
    private DataSource dataSource;

    @GetMapping         //@RequestMapping(method = {RequestMethod.GET})
    public String hi(){
        System.out.println(dataSource);
        return "hello world!";
    }
}
