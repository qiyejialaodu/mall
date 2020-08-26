package com.orz.mall.mall;

import com.orz.mall.mall.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "MALL-SERVICE")
public interface IUserService {

    @GetMapping (value = "/user/list",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> findAllUser();
}
