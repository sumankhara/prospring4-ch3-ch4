package com.apress.prospring4.ch3.beans.xml;

public class InjectSimpleConfig {

	private String name = "Suman Khara";
	private int age = 39;
	private float height = 1.63f;
	private boolean programmer = true;
	private long ageInSeconds = 1009843200L;
	
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
	
	public long getAgeInSeconds() {
		return ageInSeconds;
	}
	
	public void setAgeInSeconds(long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	
}
