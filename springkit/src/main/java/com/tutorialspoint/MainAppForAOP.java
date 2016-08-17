package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuyuming on 16/8/17.
 */
public class MainAppForAOP {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("BeansForAOP.xml");
        StudentForAOPXML student = (StudentForAOPXML) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
