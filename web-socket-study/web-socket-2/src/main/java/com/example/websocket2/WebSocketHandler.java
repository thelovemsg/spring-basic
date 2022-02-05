package com.example.websocket2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@Component
@RequiredArgsConstructor
public class WebSocketHandler extends TextWebSocketHandler {

    /*
        서버와 클라이언트가 1:N으로 관계맺음.
        한 서버에 여러 클라이언트가 접속가능.
        여러명이 발송한 메시지를 받아 처리할 Handler가 필요.
     */
    private final ObjectMapper objectMapper;
    private final ChatService chatService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        log.info("payload {}", payload);
//        TextMessage textMessage = new TextMessage("Welcome to chatting server for msg");
//        session.sendMessage(textMessage);
        //받은 채팅 메시지를 채팅 메시지 객체로 변환
        ChatMessage chatMessage = objectMapper.readValue(payload, ChatMessage.class);
        //받은 정보를 이용해서 채팅방 정보 조회
        System.out.println("chatMessage.getRoodId() = " + chatMessage.getRoodId());
        ChatRoom room = chatService.findRoomById(chatMessage.getRoodId());
        
        //접속한 모든 인원들에게 정보 전송 => forEach 부분
         room.handleActions(session, chatMessage, chatService);
    }
}
