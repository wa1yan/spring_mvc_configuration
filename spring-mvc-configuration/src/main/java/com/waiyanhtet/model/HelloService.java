package com.waiyanhtet.model;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	private static String message;
	
	static {
		message = "Hello from root webapplication initializer";
	}
	
	public String getMessage() {
		return message;
	}
}
