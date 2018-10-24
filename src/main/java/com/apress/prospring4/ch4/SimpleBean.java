package com.apress.prospring4.ch4;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleBean {

	private static final String DEFAULT_NAME = "Suman Khara";
	private String name;
	private int age = Integer.MIN_VALUE;
	
	public SimpleBean() {
		System.out.println("SimpleBean constructor");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void init() {
		System.out.println("Initializing bean");
		
		if(name == null) {
			System.out.println("Using default name");
			name = DEFAULT_NAME;
		}
		
		if(age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("You must set the age property of any beans of type " + SimpleBean.class);
		}
	}
	
	public void destroy() {
		System.out.println("Destroying Bean");
	}
	
	public String toString() {
		return "Name: " + name + "\nAge: " + age;
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:app-context-init-xml.xml");
		
		SimpleBean bean1 = getBean("bean1", ctx);
		if(bean1 != null) {
			System.out.println(bean1);
		}
		SimpleBean bean2 = getBean("bean2", ctx);
		if(bean2 != null) {
			System.out.println(bean2);
		}
		SimpleBean bean3 = getBean("bean3", ctx);
		if(bean3 != null) {
			System.out.println(bean3);
		}
		
		ctx.destroy();
	}

	private static SimpleBean getBean(String beanName, GenericXmlApplicationContext ctx) {
		try {
			SimpleBean bean = ctx.getBean(beanName, SimpleBean.class);
			return bean;
		}
		catch(BeanCreationException ex) {
			System.out.println("An error occured in bean configuration: " + ex.getMessage());
		}
		return null;
	}

}
