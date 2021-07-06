package com.sun.algorithm.service;


import com.sun.algorithm.entity.User;
import com.sun.algorithm.entity.response.BaseResult;
import com.sun.algorithm.entity.util.PageBean;

import java.util.List;

/**
 * @author sunkai
 * @since 2021/3/17 11:13 上午
 */
public interface IUserservice {

    BaseResult<List<User>> getUserList();

    BaseResult<PageBean<List<User>>> listUserByUser(Integer userId);
}
