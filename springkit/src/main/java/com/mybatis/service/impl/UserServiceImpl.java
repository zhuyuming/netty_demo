package com.mybatis.service.impl;

import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhuyuming on 16/8/18.
 */

public class UserServiceImpl implements IUserService {

    private UserMapper userDao;
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
