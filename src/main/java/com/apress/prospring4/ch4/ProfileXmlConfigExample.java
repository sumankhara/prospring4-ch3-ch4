package com.apress.prospring4.ch4;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ProfileXmlConfigExample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles("highschool");
		ctx.load("classpath:*-config.xml");
		ctx.refresh();
		
		FoodProviderService foodProviderService = ctx.getBean("foodProviderService", FoodProviderService.class);
		
		List<Food> lunchSet = foodProviderService.provideLunchSet();
		
		for(Food food: lunchSet) {
			System.out.println(food.getName());
		}
		
		ctx.close();
	}

}
