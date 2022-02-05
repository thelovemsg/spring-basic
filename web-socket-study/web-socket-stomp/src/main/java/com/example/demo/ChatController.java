package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class ChatController {

    private final SimpMessageSendingOperations messagingTemplate;
    private final ChatRoomRepository chatRoomRepository;

    //메시지 발행 처리
    // /pub/chat/message로 발행 요청하면 해당 controller가 메시지를 받아 처리.
    @MessageMapping("/chat/message")
    public void message(ChatMessage message) {
        if (ChatMessage.MessageType.JOIN.equals(message.getType())){
            chatRoomRepository.enterChatRoom(message.getRoomId());
            message.setMessage(message.getSender() + "님이 입장하셨습니다.");

        }
        // /sub/chat/message/{roomId} 로  메시지 전달
        messagingTemplate.convertAndSend("/sub/chat/room/" + message.getRoomId(), message);
    }
}