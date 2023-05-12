package com.chat.app.chatroomapp.models;

import java.sql.Time;
import java.util.TimeZone;

public class Message {
    private String name;
    private String content;

    public Message(String name, String content, Time time) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
