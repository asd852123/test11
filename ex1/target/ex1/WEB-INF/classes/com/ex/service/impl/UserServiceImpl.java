package com.ex.service.impl;

import com.ex.dao.IUserDao;
import com.ex.model.User;
import com.ex.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * by luoqi
 * 描述
 * 日期 2018/8/9 18:18
 **/

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(int userId) {
        return this.userDao.selectUser(userId);
    }

    public User findByUsername(String userName) {
        return userDao.findByUsername(userName);
    }

    public User findByUserAccount(String userAccount) {
        return userDao.findByUserAccount(userAccount);
    }
}
