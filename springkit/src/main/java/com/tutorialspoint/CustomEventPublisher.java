package com.tutorialspoint;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by zhuyuming on 16/8/17.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    public void setApplicationEventPublisher
            (ApplicationEventPublisher publisher){
        this.publisher = publisher;
    }
    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        publisher.publishEvent(ce);
    }
}
