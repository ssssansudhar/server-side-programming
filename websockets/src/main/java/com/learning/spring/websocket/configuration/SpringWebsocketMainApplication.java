package com.learning.spring.websocket.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.learning.spring.websocket.*"})
public class SpringWebsocketMainApplication implements CommandLineRunner {


    @Autowired
    ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringWebsocketMainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List.of(applicationContext.getBeanDefinitionNames()).stream()
                .forEach(x -> System.out.println(x));
    }
}
