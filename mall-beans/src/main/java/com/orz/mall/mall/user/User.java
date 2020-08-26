package com.orz.mall.mall.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author admin
 * @create 2020-06-19 16:19
 */
@Data
public class User implements Serializable{

    private Integer id;

    private String name;

    private String password;

    private Integer age;
}
