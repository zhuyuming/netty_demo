package com.mybatis.test;

import com.mybatis.bean.User;
import com.mybatis.service.UserService;
import com.tutorialspoint.StudentForAOPXML;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuyuming on 16/8/18.
 */
public class MybatisTest {
    protected static UserService userService;
    public static void main(String[] args) {
        ApplicationContext cxt =
                new ClassPathXmlApplicationContext("applicationContextForMybatis.xml");
        userService = (UserService)cxt.getBean("userServiceImpl");
        User user = new User();
        user.setId(1);
        user.setName("绿竹");
        user.setPassword("123456");
        userService.save(user);
    }
}
