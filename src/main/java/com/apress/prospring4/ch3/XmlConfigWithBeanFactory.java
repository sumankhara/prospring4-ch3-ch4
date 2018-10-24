package com.apress.prospring4.ch3;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlConfigWithBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("xml-bean-factory-config.xml"));
		
		Oracle oracle = factory.getBean("oracle", Oracle.class);
		
		System.out.println(oracle.defineMeaningOfLife());
	}

}
