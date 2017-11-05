package com.poc.services.hello;

public class HelloService {

    public String message(String name) {
		String n = (name == null) ? "" : name.trim();
		return "Hello " + (n.isEmpty() ? "GitHub" : n);
    }

}
