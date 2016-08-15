package com.tutorialspoint;

/**
 * Created by amanda on 15/08/16.
 */
public class Foo {
    private int year;
    private String name;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Foo(int year, String name){
        this.year=year;
        this.name=name;
    }

    public void getAll(){
        System.out.println("FOO:"+this.name+"="+this.year);
    }



}
