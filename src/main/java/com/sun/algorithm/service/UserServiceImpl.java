package com.sun.algorithm.service;

import com.alibaba.fastjson.JSON;
import com.sun.algorithm.entity.User;
import com.sun.algorithm.entity.response.BaseResult;
import com.sun.algorithm.entity.util.PageBean;
import com.sun.algorithm.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author sunkai
 * @since 2021/3/17 11:18 上午
 */
@Service
public class UserServiceImpl implements IUserservice{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

   /* ThreadPoolExecutor executor = new ThreadPoolExecutor(2,5,1000, TimeUnit.SECONDS,new ArrayBlockingQueue<>(100));
*/

    @Override
    public BaseResult<List<User>> getUserList() {
        BaseResult<List<User>> result = new BaseResult();
        User user = new User();
        user.setFlagBin(4);
        List<User> users = userMapper.listUser(user);

        logger.info("getUserList res={}", JSON.toJSONString(result));
        result.setData(users);
        return result;
    }

    @Override
    public BaseResult<PageBean<List<User>>> listUserByUser(Integer userId) {
        int userNum = userMapper.countUser();
        List<User> users = userMapper.listUserByConditon(0, 100);

        PageBean<List<User>> pageBean = new PageBean<>(1,100);
        pageBean.setData(users);
        pageBean.setTotalNum(userNum);

        BaseResult result = new BaseResult<>();
        result.setData(pageBean);

        return result;
    }
}
