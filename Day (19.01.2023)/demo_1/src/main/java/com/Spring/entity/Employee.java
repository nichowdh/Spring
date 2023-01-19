package com.Spring.entity;

public class Employee {
	private int id;
	private String ename;

	public Employee() {
		System.out.println("Def cons");

	}

	public Employee(int id) {
		this.id = id;

	}

	public Employee(String ename) {
		this.ename = ename;

	}

	public Employee(int id, String ename) {
		this.id = id;
		this.ename = ename;

	}

	public void display() {
		System.out.println(id + " " + ename);
	}

}
