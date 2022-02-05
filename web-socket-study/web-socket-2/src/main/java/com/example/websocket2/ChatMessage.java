package com.example.websocket2;

import lombok.Data;

@Data
public class ChatMessage {
    public enum MessageType{
        ENTER, TALK
    }

    private MessageType type;
    private String roodId;
    private String sender;
    private String message;
}
