package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by amanda on 15/08/16.
 */
public class MainAppForAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );

        TextEditor5 te = (TextEditor5) context.getBean("textEditor5");
        te.spellCheck();
    }
}
