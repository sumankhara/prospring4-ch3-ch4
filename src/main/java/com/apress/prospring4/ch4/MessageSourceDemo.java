package com.apress.prospring4.ch4;

import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageSourceDemo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:i18n.xml");
		
		Locale english = Locale.ENGLISH;
		Locale czech = new Locale("cs", "CZ");
		
		System.out.println(ctx.getMessage("msg", null, english));
		System.out.println(ctx.getMessage("msg", null, czech));
		
		System.out.println(ctx.getMessage("nameMsg", new Object[] {"Suman", "Khara"}, english));
		
	}

}
