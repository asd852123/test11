package com.ex.dao;

import com.ex.model.User;

public interface IUserDao {

    User selectUser(Integer id);

    User findByUsername(String userName);

    User findByUserAccount(String userAccount);

}