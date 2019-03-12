package com.nagarro.nagp.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private long id ;
	private String value;
	public Message(){
		
	}
	public Message(long id, String value) {
		this.id = id;
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
