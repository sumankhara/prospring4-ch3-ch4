package com.apress.prospring4.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring4.ch3.beans.MessageProvider;
import com.apress.prospring4.ch3.beans.MessageRenderer;

public class MainApp {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//		ctx.load("classpath:app-context-xml.xml");
		ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();
		
//		MessageProvider  messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
		MessageRenderer messageRenderer = ctx.getBean(MessageRenderer.class);
		
		messageRenderer.render();
	}

}
