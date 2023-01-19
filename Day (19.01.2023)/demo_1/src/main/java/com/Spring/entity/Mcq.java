package com.Spring.entity;

import java.util.Iterator;
import java.util.List;

public class Mcq {
	private int id;
	private String sname;
	private List<String> ans;

	public Mcq(int id, String sname, List<String> ans) { // parameterized constructor
		super();
		this.id = id;
		this.sname = sname;
		this.ans = ans;
	}

	public void display() {
		System.out.println(id + " " + sname);
		System.out.println("Answer are: ");
		Iterator<String> itr = ans.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
