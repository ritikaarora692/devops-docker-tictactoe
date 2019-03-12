package com.nagarro.nagp.messenger.service;

import com.nagarro.nagp.messenger.model.Message;

public class MessageService {
	Message message;
	
	public MessageService(){
		
	}

	public Message getMessage() {
		message = new Message(1,"This is a test message");
		return message;
	}

}
