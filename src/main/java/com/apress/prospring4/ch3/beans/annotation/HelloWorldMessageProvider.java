package com.apress.prospring4.ch3.beans.annotation;

import org.springframework.stereotype.Service;

import com.apress.prospring4.ch3.beans.MessageProvider;

//@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello World!";
	}

}
