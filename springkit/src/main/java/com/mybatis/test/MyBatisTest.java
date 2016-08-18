package com.mybatis.test;

import com.mybatis.pojo.User;
import com.mybatis.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

/**
 * Created by amanda on 18/08/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:applicationContextForMybatis.xml", "classpath:spring-mybatis.xml" })
public class MyBatisTest {
    //注入userService
    @Autowired
    private IUserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setUserName("xdp_gacl_白虎神皇");
        user.setUserBirthday(new Date());
        user.setUserSalary(10000D);
        userService.addUser(user);
    }

    @Test
    public void testGetUserById(){
        String userId = "fb1c5941094e400b975f10d9a9d602a3";
        User user = userService.getUserById(userId);
        System.out.println(user.getUserName());
    }

}
