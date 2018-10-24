package com.apress.prospring4.ch3.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.prospring4.ch3.beans.MessageProvider;
import com.apress.prospring4.ch3.beans.MessageRenderer;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

	@Autowired
	private MessageProvider messageProvider;

	public void render() {
		if(messageProvider == null) {
			throw new RuntimeException("You must provide the property messageProvider of class: " + StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}
