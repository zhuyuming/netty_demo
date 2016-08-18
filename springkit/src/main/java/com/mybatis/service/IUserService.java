package com.mybatis.service;

import com.mybatis.pojo.User;

/**
 * Created by zhuyuming on 16/8/18.
 */
public interface IUserService {
    public User getUserById(int userId);
}
