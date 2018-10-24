package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class MessageEvent extends ApplicationEvent {

	private String msg;
	
	public MessageEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
