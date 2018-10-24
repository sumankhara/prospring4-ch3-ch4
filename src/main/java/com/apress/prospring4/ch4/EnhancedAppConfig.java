package com.apress.prospring4.ch4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value="classpath:message.properties")
public class EnhancedAppConfig {

	@Autowired
	private Environment env;
	
	@Bean
	@Lazy(value = true)
	public MessageProvider messageProvider() {
		return new ConfigurableMessageProvider(env.getProperty("message"));
	}
	
	@Bean
	@Scope(value = "prototype")
	@DependsOn(value = "messageProvider")
	public MessageRenderer messageRenderer() {
		MessageRenderer messageRenderer = new StandardOutMessageRenderer();
		messageRenderer.setMessageProvider(messageProvider());
		
		return messageRenderer;
	}
}
