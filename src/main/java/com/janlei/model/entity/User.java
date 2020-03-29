package com.janlei.model.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j //提供日志记录
@Data //类在编译阶段，会生成对应的方法get/set/hashcode/equals/toString
public class User {

    private String id;

    private String name;

    private Integer age;

    private char sex;
}
