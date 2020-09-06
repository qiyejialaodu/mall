package com.orz.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.orz.mall.mall.beans.user.User;

import java.util.List;

/**
 * @author admin
 * @create 2020-06-19 16:18
 */
public interface UserMapper extends BaseMapper<User>{

//    @Select("SELECT * FROM user")
    public List<User> findAllUser();
}
