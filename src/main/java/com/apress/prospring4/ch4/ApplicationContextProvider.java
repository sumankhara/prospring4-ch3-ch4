package com.apress.prospring4.ch4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationContextProvider implements ApplicationContextAware {

	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Passing the reference of ApplicationContext to ApplicationContextProvider");
		ctx = applicationContext;
		if(ctx instanceof GenericApplicationContext) {
			System.out.println("Registering shutdown hook");
			((GenericApplicationContext) ctx).registerShutdownHook();
		}
	}
}
