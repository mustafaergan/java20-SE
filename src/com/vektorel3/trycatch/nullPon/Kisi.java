package com.vektorel3.trycatch.nullPon;

public class Kisi {
	
	int id;
	String name;
	String password;
	
	public void login(){
		System.out.println("login oldu");
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

}
