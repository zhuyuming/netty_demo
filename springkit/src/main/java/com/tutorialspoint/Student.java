package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by amanda on 15/08/16.
 */
public class Student {
    private Integer age;
    private String name;
    //@Required 注释应用于 bean 属性的 setter 方法
    @Required
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
