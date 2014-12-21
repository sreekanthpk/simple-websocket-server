package org.sree.websocket;

import java.io.IOException;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MessageHandler extends TextWebSocketHandler {

	@Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
		TextMessage returnMessage = new TextMessage(message.getPayload()+" received at server");
		try {
			session.sendMessage(returnMessage);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}