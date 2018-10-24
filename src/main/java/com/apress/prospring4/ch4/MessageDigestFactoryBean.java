package com.apress.prospring4.ch4;

import java.security.MessageDigest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageDigestFactoryBean implements FactoryBean<MessageDigest>, InitializingBean {

	private String algorithmName = "MD5";
	
	private MessageDigest messageDigest = null;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		messageDigest = MessageDigest.getInstance(algorithmName);
	}

	@Override
	public MessageDigest getObject() throws Exception {
		return messageDigest;
	}

	@Override
	public Class<MessageDigest> getObjectType() {
		return MessageDigest.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}
}