package com.example.websocket2;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashSet;
import java.util.Set;

@Data
public class ChatRoom {

    private String roomId;
    private String name;

    //  Allows sending messages over a WebSocket connection and closing it.
    private Set<WebSocketSession> sessions = new HashSet<>();
    @Builder
    public ChatRoom(String roomId, String name){
        this.roomId = roomId;
        this.name = name;
    }

    public void handleActions(WebSocketSession session, ChatMessage chatMessage, ChatService chatService){
        if (chatMessage.getType().equals(ChatMessage.MessageType.ENTER)){
            sessions.add(session);
            chatMessage.setMessage(chatMessage.getSender() + "님이 입장했습니다.");
        }
        sendMessage(chatMessage, chatService);
    }

    public <T> void sendMessage(T message,  ChatService chatservice){
        sessions.parallelStream().forEach(session -> chatservice.sendMessage(session, message));
    }

}
