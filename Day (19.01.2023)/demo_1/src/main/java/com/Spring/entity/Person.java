package com.Spring.entity;

public class Person {
	private String name; // only one property

	public String getName() { // geter method
		return name;

	}

	public void setName(String name) { // setter method
		this.name = name;
	}

	public void display() {
		System.out.println("Hi: " + name);
	}

}
