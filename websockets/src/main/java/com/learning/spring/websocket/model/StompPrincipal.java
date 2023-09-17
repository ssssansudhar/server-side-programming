package com.learning.spring.websocket.model;

import java.security.Principal;

public class StompPrincipal implements Principal {

    String name;

    public StompPrincipal(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
