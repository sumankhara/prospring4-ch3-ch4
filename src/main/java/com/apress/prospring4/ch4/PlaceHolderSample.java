package com.apress.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PlaceHolderSample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:app-property.xml");
		
		AppProperty appProperty = ctx.getBean(AppProperty.class);
		System.out.println(appProperty.getApplicationHome());
		System.out.println(appProperty.getUserHome());
	}

}
