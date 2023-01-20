package com.Spring.entity;

public class Emp1 {
	private int id;
	private String ename;
	private Address address; // aggrigation
	// using getter & sette methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println(id + " " + ename);
		System.out.println(address.toString());
	}

}
