package com.mybatis.service;

import com.mybatis.pojo.User;

/**
 * Created by amanda on 18/08/16.
 */
public interface IUserService {
    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    User getUserById(String userId);
}
