package com.Spring.entity;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mcq {
	private int id;
	private String name;
	private Map<String, String> ans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Map<String, String> getAns() {
		return ans;
	}

	public void setAns(Map<String, String> ans) {
		this.ans = ans;
	}

	public void display() {
		System.out.println(id + " " + name);
		System.out.println("Answer are: ");
		Set<Entry<String, String>> set = ans.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("Answers: " + entry.getKey() + "Shared By " + entry.getValue());
		}
	}

}
