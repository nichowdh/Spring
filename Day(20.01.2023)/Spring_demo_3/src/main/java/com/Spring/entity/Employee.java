package com.Spring.entity;

public class Employee {
	private int id;
	private String ename;
	private String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void display() {
		System.out.println(id + " " + ename + " " + city);
	}

}
