package com.apress.prospring4.ch4;

import java.security.MessageDigest;

public class MessageDigester {

	private MessageDigest digest1;
	private MessageDigest digest2;
	
	public void setDigest1(MessageDigest digest1) {
		this.digest1 = digest1;
	}
	
	public void setDigest2(MessageDigest digest2) {
		this.digest2 = digest2;
	}
	
	public void digest(String msg) {
		System.out.println("Using digest1");
		digest(digest1, msg);
		
		System.out.println("Using digest2");
		digest(digest2, msg);
	}
	
	public void digest(MessageDigest digest, String msg) {
		System.out.println("Using algorithm: " + digest.getAlgorithm());
		digest.reset();
		byte[] msgBytes = msg.getBytes();
		byte[] output = digest.digest(msgBytes);
		System.out.println(output);
	}
}
