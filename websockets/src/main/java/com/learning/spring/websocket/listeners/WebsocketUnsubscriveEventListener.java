package com.learning.spring.websocket.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionUnsubscribeEvent;

@Component
public class WebsocketUnsubscriveEventListener implements ApplicationListener<SessionUnsubscribeEvent> {
    @Override
    public void onApplicationEvent(SessionUnsubscribeEvent event) {
        System.out.println("Websocket session unsubscribed "+event.getUser());
    }
}
