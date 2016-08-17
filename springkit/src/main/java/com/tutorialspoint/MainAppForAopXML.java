package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuyuming on 16/8/17.
 */
public class MainAppForAopXML {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("BeansForAOPXML.xml");
        StudentForAOPXML student = (StudentForAOPXML) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
