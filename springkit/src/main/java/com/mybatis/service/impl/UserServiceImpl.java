package com.mybatis.service.impl;

import com.mybatis.bean.User;
import com.mybatis.mapper.UserMapper;
import com.mybatis.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by zhuyuming on 16/8/18.
 */
@Service //告诉spring这个业务组件
@Transactional //告诉spring这个类需要事务
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;

    public void save(User user) {
        //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
        mapper.save(user);
    }
    public void update(User user) {
        //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
        mapper.update(user);
    }
    public User find(int id) {
        //此处不再进行创建SqlSession，都已交由spring去管理了。
        return mapper.find(id);
    }
    public void delete(int id) {
        //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
        mapper.delete(id);
    }
}
