package com.apress.prospring4.ch3.beans.xml;

import com.apress.prospring4.ch3.beans.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {

	public String getMessage() {
		return "Hello World!";
	}

}
