package com.janlei.entity;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author Janlei
 * @since 2020-05-09 11:45:29
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = -79455463832018493L;
    
    private Integer userId;
    
    private String userName;
    
    private String password;
    
    private String phone;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}