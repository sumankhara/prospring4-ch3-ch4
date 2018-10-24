package com.apress.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSampleExample {

	public static void main(String[] args) {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EnhancedAppConfig.class);
		
		MessageRenderer renderer = ctx.getBean(MessageRenderer.class);
		renderer.render();
		
		((AnnotationConfigApplicationContext) ctx).close();
	}

}
