package com.janlei.mapper;

import com.janlei.model.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<User> {

    /**
     * getUser
     * @param id
     * @return user
     */
    User getUser(Integer id);
}
