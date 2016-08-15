package com.tutorialspoint;

/**
 * Created by zhuyuming on 16/8/15.
 */
public class HelloWorldPrototype {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
