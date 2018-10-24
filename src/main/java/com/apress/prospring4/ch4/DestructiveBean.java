package com.apress.prospring4.ch4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DestructiveBean {

	public DestructiveBean() {
		System.out.println("DestructiveBean constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initializing bean");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying bean");
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:spring-aware-annotation.xml");
	}

}
