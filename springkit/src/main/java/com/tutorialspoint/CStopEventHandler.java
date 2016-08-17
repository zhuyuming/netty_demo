package com.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by zhuyuming on 16/8/17.
 */
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Received");
    }
}
