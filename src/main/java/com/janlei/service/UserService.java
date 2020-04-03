package com.janlei.service;

import com.janlei.model.User;

public interface UserService {

    int addUser(User user);

    User findAllUser(Integer userId);
}
