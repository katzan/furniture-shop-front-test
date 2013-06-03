package com.katzan.spring.furniturefronttest.email;


public interface NotificationService {
	
	void sendMessage(String mailTo, String message);
}
