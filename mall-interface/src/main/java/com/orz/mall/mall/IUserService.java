package com.orz.mall.mall;

import com.orz.mall.mall.beans.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "MALL-SERVICE")
public interface IUserService {

    @GetMapping (value = "/user/list")
    public List<User> findAllUser();

    @GetMapping("/user/get/{id}")
    public User findUserById(@PathVariable Integer id);
}
