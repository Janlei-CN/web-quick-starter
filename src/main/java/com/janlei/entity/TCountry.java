package com.janlei.entity;

import java.io.Serializable;

/**
 * (TCountry)实体类
 *
 * @author Janlei
 * @since 2020-05-09 11:45:25
 */
public class TCountry implements Serializable {
    private static final long serialVersionUID = -64931595066720942L;
    
    private Integer id;
    
    private String name;
    
    private String referred;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferred() {
        return referred;
    }

    public void setReferred(String referred) {
        this.referred = referred;
    }

}