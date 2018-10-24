package com.apress.prospring4.ch3.beans.xml;

import com.apress.prospring4.ch3.beans.MessageProvider;
import com.apress.prospring4.ch3.beans.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {

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
