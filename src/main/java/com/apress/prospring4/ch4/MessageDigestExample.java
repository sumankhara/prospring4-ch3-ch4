package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestExample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:factory-bean.xml");
		
		MessageDigester digester = ctx.getBean(MessageDigester.class);
		digester.digest("Hello World");
	}

}
