package com.apress.prospring4.ch3.beans.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.apress.prospring4.ch3.beans.MessageProvider;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;
	
	/*@Autowired
	public ConfigurableMessageProvider(@Value("Configurable massage") String message) {
		this.message = message;
	}*/
	
	@Autowired
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
