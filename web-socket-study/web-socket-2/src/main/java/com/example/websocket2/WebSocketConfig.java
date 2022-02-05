package com.example.websocket2;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@RequiredArgsConstructor // final 선언된 객체 생성자 주입
@Configuration // 설정 파일 생성 or bean 생성용 어노테이션
@EnableWebSocket // Websocket활성화!
public class WebSocketConfig implements WebSocketConfigurer {

    /*
    *   작성한 handler를 활성화 하기위한 Config 파일 작성
    *
    * */

    private final WebSocketHandler webSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketHandler, "/ws/chat").setAllowedOrigins("*");
    }

}
