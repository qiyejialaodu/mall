package com.orz.mall.mapper;

import com.orz.mall.mall.user.User;

import java.util.List;

/**
 * @author admin
 * @create 2020-06-19 16:18
 */
public interface UserMapper {

//    @Select("SELECT * FROM user")
    public List<User> findAllUser();
}
