package com.apress.prospring4.ch4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Publisher implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void publish(String msg) {
		applicationContext.publishEvent(new MessageEvent(this, msg));
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:application-events.xml");
		
		Publisher publisher = ctx.getBean(Publisher.class);
		publisher.publish("Hello World");
		publisher.publish("The quick brown fox jumped over the lazy dog");
	}
}
