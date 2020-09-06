package com.orz.mall.controller.user;

import com.orz.mall.mall.IUserService;
import com.orz.mall.mall.beans.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired(required = false)
    private IUserService userService;

    @GetMapping(value = "/list")
    public List<User> findAll(){
        return userService.findAllUser();
    }

    @GetMapping("/get/{id}")
    public User findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }
}
