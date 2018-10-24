package com.apress.prospring4.ch3.beans.annotation;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {

	private String name = "Suman Khara";
	private int age = 39;
	private float height = 1.63f;
	private boolean programmer = true;
	private long ageInSeconds = 1009843200L;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getHeight() {
		return height;
	}
	
	public boolean isProgrammer() {
		return programmer;
	}
	
	public long getAgeInSeconds() {
		return ageInSeconds;
	}	
	
}
