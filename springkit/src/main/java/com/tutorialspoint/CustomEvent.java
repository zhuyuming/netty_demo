package com.tutorialspoint;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zhuyuming on 16/8/17.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My Custom Event";
    }
}
