package com.orz.mall.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.orz.mall.mall.IUserService;
import com.orz.mall.mall.beans.user.User;
import com.orz.mall.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.selectById(id);
    }
}
