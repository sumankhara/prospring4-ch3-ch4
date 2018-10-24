package com.apress.prospring4.ch3.beans.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class InjectSimpleSpel {

	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-xml.xml");
		ctx.refresh();
		
		InjectSimpleSpel simple = ctx.getBean(InjectSimpleSpel.class);
		System.out.println(simple);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isProgrammer() {
		return programmer;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public Long getAgeInSeconds() {
		return ageInSeconds;
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
