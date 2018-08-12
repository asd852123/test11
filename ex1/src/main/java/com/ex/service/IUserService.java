package com.ex.service;

import com.ex.model.User;

public interface IUserService {

    public User selectUser(int userId);

    public User findByUsername(String userName);

    public User findByUserAccount(String userAccount);
}
