package com.apress.prospring4.ch3;

public class ReplacementTarget {

	public String formatMessage(String msg) {
		return msg;
	}
	
	public String formatMessage(Object msg) {
		return msg.toString();
	}
}
