package com.sun.algorithm.controller;

import com.sun.algorithm.entity.User;
import com.sun.algorithm.entity.response.BaseResult;
import com.sun.algorithm.entity.util.PageBean;
import com.sun.algorithm.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sunkai
 * @since 2021/3/17 11:29 上午
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserservice userservice;

    @GetMapping("/listUser")
    public BaseResult<List<User>> listUser(){
        return userservice.getUserList();
    }

    @PostMapping("/listUserByCondition")
    @CrossOrigin
    public BaseResult<PageBean<List<User>>> listUserByUser(@RequestParam("userId") Integer userId){
        return userservice.listUserByUser(userId);
    }
}
