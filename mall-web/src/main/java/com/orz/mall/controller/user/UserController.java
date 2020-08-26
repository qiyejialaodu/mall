package com.orz.mall.controller.user;

import com.orz.mall.mall.IUserService;
import com.orz.mall.mall.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> findAll(){
        return userService.findAllUser();
    }
}
