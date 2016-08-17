package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuyuming on 16/8/17.
 */
public class MainAppForEvent {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationevent.xml");

        // Let us raise a start event.
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

        CustomEventPublisher cvp =
                (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();

        // Let us raise a stop event.
        context.stop();
    }
}
