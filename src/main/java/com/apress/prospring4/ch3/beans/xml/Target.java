package com.apress.prospring4.ch3.beans.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Target {

	private Foo foo;
	private Foo foo2;
	private Bar bar;
	
	public Target() {
		
	}
	
	public Target(Foo foo) {
		System.out.println("Target(Foo) called");
	}
	
	public Target(Bar bar) {
		System.out.println("Target(Foo, Bar) called");
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
		System.out.println("Property foo set");
	}

	public void setFoo2(Foo foo2) {
		this.foo2 = foo2;
		System.out.println("Property foo2 set");
	}

	public void setBar(Bar bar) {
		this.bar = bar;
		System.out.println("Property bar set");
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:autowiring.xml");
		
		Target t = null;
		
		System.out.println("Using byName: ");
		t = ctx.getBean("targetByName", Target.class);
		
		System.out.println("Using byType: ");
		t = ctx.getBean("targetByType", Target.class);
		
		System.out.println("Using constructor: ");
		t = ctx.getBean("targetConstructor", Target.class);
	}
}
