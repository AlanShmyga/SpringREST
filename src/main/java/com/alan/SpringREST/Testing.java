package com.alan.SpringREST;

public class Testing {
	
	private final int id;
	private final String name;
	private final long phone;
	
	Testing(int id, String name, long phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public long getPhone() {
		return phone;
	}
}
