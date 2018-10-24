package com.apress.prospring4.ch3.beans.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimple")
public class InjectSimpleValues {

	@Value("Unmisha Khara")
	private String name;
	
	@Value("7")
	private int age;
	
	@Value("1.12")
	private float height;
	
	@Value("false")
	private boolean programmer;
	
	@Value("287165")
	private Long ageInSeconds;
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();
		
		InjectSimpleValues simple = ctx.getBean(InjectSimpleValues.class);
		System.out.println(simple);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	public String toString() {
		return "Name: " + name + "\n"
				+ "Age: " + age + "\n"
				+ "Height: " + height + "\n"
				+ "Programmer: " + programmer + "\n"
				+ "Age in seconds: " + ageInSeconds + "\n";
	}
}
