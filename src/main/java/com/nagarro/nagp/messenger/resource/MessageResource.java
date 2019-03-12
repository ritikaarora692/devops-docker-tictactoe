package com.nagarro.nagp.messenger.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nagarro.nagp.messenger.model.Message;
import com.nagarro.nagp.messenger.service.MessageService;

@Path("messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessages(){
		return messageService.getMessage();
	}

}
