package com.ders25.jdbc.okul.entity;

public class Ogrenci {
	int id;
	String name;
	
	public Ogrenci(int id,String name) {
		this.id =id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
