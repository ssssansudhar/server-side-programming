package com.learning.spring.websocket.controller;

import com.learning.spring.websocket.model.HelloMessage;
import com.learning.spring.websocket.model.Greeting;
import com.learning.spring.websocket.model.StompPrincipal;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebsocketController {


    @MessageMapping("hello")
    @SendTo("/topic/greetings")
    public Greeting getGreeting(StompPrincipal stompPrincipal, HelloMessage helloMessage) throws Exception {
        System.out.println("Message received "+helloMessage+"from "+stompPrincipal.getName());
        Thread.sleep(1000);
        return new Greeting(String.format("Hello %s",helloMessage.getName()));
    }
}
