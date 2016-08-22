package com.test;

import com.mybatis.domain.User;
import com.mybatis.service.UserServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.UUID;

/**
 * Created by zhuyuming on 16/8/22.
 */
public class MyBatisTest {
    private UserServiceI userService;

    @Test
    public void testAddUser(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"applicationContextForMybatis.xml"});
        UserServiceI userService = (UserServiceI) ac.getBean("userService");
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setUserName("地方规划局快乐");
        user.setUserBirthday(new Date());
        user.setUserSalary(10000D);
        userService.addUser(user);
    }
}
