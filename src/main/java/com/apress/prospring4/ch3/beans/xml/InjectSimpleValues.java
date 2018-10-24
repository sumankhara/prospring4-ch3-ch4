package com.apress.prospring4.ch3.beans.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleValues {

	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-xml.xml");
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
