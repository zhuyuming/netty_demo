package com.mybatis.service;

import com.mybatis.domain.User;

/**
 * Created by zhuyuming on 16/8/22.
 */
public interface UserServiceI {
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
