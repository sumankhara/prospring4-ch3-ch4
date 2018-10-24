package com.apress.prospring4.ch4;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleBeanWithInterface implements InitializingBean, DisposableBean {
	
	private static final String DEFAULT_NAME = "Suman Khara";
	private String name;
	private int age = Integer.MIN_VALUE;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean");
		
		if(name == null) {
			System.out.println("Using default name");
			name = DEFAULT_NAME;
		}
		
		if(age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("You must set the age property of any beans of type " + SimpleBeanWithInterface.class);
		}
	}
	
	public String toString() {
		return "Name: " + name + "\nAge: " + age;
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:app-context-init-xml.xml");
		
		SimpleBeanWithInterface bean1 = getBean("simpleBeanWithInterface1", ctx);
		if(bean1 != null) {
			System.out.println(bean1);
		}
		SimpleBeanWithInterface bean2 = getBean("simpleBeanWithInterface2", ctx);
		if(bean2 != null) {
			System.out.println(bean2);
		}
		SimpleBeanWithInterface bean3 = getBean("simpleBeanWithInterface3", ctx);
		if(bean3 != null) {
			System.out.println(bean3);
		}
		
		ctx.destroy();
	}

	private static SimpleBeanWithInterface getBean(String beanName, GenericXmlApplicationContext ctx) {
		try {
			SimpleBeanWithInterface bean = ctx.getBean(beanName, SimpleBeanWithInterface.class);
			return bean;
		}
		catch(BeanCreationException ex) {
			System.out.println("An error occured in bean configuration: " + ex.getMessage());
		}
		return null;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Bean");
	}
}
