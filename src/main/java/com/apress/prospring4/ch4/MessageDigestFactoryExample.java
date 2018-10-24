package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestFactoryExample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:factory-bean-method-attributes.xml");
		
		MessageDigester digester = ctx.getBean(MessageDigester.class);
		digester.digest("Hello World");
	}

}
