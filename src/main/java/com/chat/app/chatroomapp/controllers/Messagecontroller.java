package com.chat.app.chatroomapp.controllers;

import com.chat.app.chatroomapp.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Messagecontroller {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message ){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.getStackTrace();
        }
        return message;
    }
}
