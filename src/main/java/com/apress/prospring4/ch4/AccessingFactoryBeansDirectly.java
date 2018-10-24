package com.apress.prospring4.ch4;

import java.security.MessageDigest;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AccessingFactoryBeansDirectly {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:factory-bean.xml");
		
		MessageDigest msgDigest = (MessageDigest) ctx.getBean("shaDigest");
		
		MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean) ctx.getBean("&shaDigest");
		
		try {
			MessageDigest shaDigest = factoryBean.getObject();
			System.out.println(shaDigest.digest("Hello World".getBytes()));
			System.out.println(msgDigest.digest("Hello World".getBytes()));
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
