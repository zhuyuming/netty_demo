package com.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Created by zhuyuming on 16/8/17.
 */
public class CStartEventHandler
    implements ApplicationListener<ContextStartedEvent>

{
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent Received");
    }
}
