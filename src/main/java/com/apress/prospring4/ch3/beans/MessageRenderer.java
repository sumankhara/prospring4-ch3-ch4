package com.apress.prospring4.ch3.beans;

public interface MessageRenderer {

	void render();
	void setMessageProvider(MessageProvider messageProvider);
	MessageProvider getMessageProvider();
}
