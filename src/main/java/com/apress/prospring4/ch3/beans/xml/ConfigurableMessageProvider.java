package com.apress.prospring4.ch3.beans.xml;

import com.apress.prospring4.ch3.beans.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {

	private String message;
	
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
