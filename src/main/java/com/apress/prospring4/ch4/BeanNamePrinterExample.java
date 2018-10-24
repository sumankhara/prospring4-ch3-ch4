package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanNamePrinterExample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:app-context-xml.xml");
		ctx.registerShutdownHook();
		
		BeanNamePrinter beanNamePrinter = ctx.getBean("beanNamePrinter", BeanNamePrinter.class);
		beanNamePrinter.someOperation();
	}

}
