package com.apress.prospring4.ch4;

public interface MessageRenderer {

	void render();
	MessageProvider getMessageProvider();
	void setMessageProvider(MessageProvider messageProvider);
}
