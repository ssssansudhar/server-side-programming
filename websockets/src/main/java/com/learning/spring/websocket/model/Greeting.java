package com.learning.spring.websocket.model;



public class Greeting {

    private String content;


    public Greeting(String format) {
        this.content = format;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "content='" + content + '\'' +
                '}';
    }
}
