package com.mybatis.service;

import com.mybatis.bean.User;

/**
 * Created by zhuyuming on 16/8/18.
 */
public interface UserService {
    /**保存**/
    public void save(User user);
    /**修改**/
    public void update(User user);
    /**查找**/
    public User find(int id);
    /**删除**/
    public void delete(int id);
}
