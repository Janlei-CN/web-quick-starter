package com.janlei.model.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

//@Slf4j //提供日志记录
@Data //类在编译阶段，会生成对应的方法get/set/hashcode/equals/toString
@Table(name = "user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)    //主键回填
    private Integer id;

    @Column     //指定 name=""
    private String name;

    @Column
    private Integer age;

    @Column
    private Character sex;
}
