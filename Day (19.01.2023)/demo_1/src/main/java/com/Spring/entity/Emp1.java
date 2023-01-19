package com.Spring.entity;

public class Emp1 {
	private int id;
	private String ename;
	private Address address;

	public Emp1() {
		System.out.println("Def cons");
	}

	public Emp1(int id, String ename, Address address) {
		super();
		this.id = id;
		this.ename = ename;
		this.address = address;

	}

	public void display() {
		System.out.println(id + " " + ename);
		System.out.println(address.toString());
	}

}
