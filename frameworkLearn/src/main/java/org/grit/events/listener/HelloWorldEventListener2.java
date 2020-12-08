package org.grit.events.listener;

import org.grit.events.eventDefine.HelloWorldEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldEventListener implements ApplicationListener<HelloWorldEvent> {
    @Override
    public void onApplicationEvent(HelloWorldEvent event) {
        System.out.println("receiver: " + event.getMsg());
    }
}
