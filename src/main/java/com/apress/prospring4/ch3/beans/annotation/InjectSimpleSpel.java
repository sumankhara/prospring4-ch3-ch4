package com.apress.prospring4.ch3.beans.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpel")
public class InjectSimpleSpel {

	@Value("#{injectSimpleConfig.name}")
	private String name;
	
	@Value("#{injectSimpleConfig.age}")
	private int age;
	
	@Value("#{injectSimpleConfig.height}")
	private float height;
	
	@Value("#{injectSimpleConfig.programmer}")
	private boolean programmer;
	
	@Value("#{injectSimpleConfig.ageInSeconds}")
	private Long ageInSeconds;
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();
		
		InjectSimpleSpel simple = ctx.getBean(InjectSimpleSpel.class);
		System.out.println(simple);
	}

	public String toString() {
		return "Name: " + name + "\n"
				+ "Age: " + age + "\n"
				+ "Height: " + height + "\n"
				+ "Programmer: " + programmer + "\n"
				+ "Age in seconds: " + ageInSeconds + "\n";
	}
}
