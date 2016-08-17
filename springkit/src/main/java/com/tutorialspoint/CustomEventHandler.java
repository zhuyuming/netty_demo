package com.tutorialspoint;

import org.springframework.context.ApplicationListener;

/**
 * Created by zhuyuming on 16/8/17.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}