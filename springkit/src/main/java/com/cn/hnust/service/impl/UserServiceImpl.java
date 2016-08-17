package com.cn.hnust.service.impl;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhuyuming on 16/8/17.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }
}
