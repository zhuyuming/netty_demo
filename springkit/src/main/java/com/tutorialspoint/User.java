package com.tutorialspoint;

/**
 * Created by amanda on 15/08/16.
 */
public class User {
    private String name ;
    private int age ;
    private Person country ;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Person getCountry() {
        return country;
    }

    public void setCountry(Person country) {
        this.country = country;
    }

    public String toString(){
        return name + " is " + age + " years old,living in " + country ;
    }
}
