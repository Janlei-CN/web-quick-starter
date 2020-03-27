package com.janlei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController         //@Controller+@ResponseBody
public class BaseCtlr {

    @Autowired
    private DataSource dataSource;

    @Value("${itcast.url}")
    private String url1;

    @Value("${bili.url}")
    private String url2;

    @GetMapping(value = "hi")         //@RequestMapping(method = {RequestMethod.GET})
    public String hi(){

        System.out.println(url1 + url2);
        System.out.println(dataSource);
        return "hi world!";
    }


    @PostMapping(value = "hello")
    public String hello(){

        System.out.println(url1 + url2);
        System.out.println(dataSource);
        return "hi world!";
    }

}
