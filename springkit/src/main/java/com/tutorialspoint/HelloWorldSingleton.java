package com.tutorialspoint;

/**
 * Created by zhuyuming on 16/8/15.
 */
public class HelloWorldSingleton {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
