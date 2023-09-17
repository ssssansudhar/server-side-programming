package com.learning.spring.websocket.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;

import javax.annotation.PostConstruct;

@Component
public class WebsocketSubscribeEventListener implements ApplicationListener<SessionSubscribeEvent> {


    @Override
    public void onApplicationEvent(SessionSubscribeEvent event) {
        System.out.println("Subscription received "+event.getUser());
    }


    @PostConstruct
    public void init(){
        System.out.println("Inside postConstruct");
    }
}
