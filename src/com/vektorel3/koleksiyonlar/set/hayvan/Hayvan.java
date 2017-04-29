package com.vektorel3.koleksiyonlar.set.hayvan;

public class Hayvan {
	int id;
	String name;
	String ture;
	
	public Hayvan(int id,String name,String turu) {
		this.id = id;
		this.name = name;
		this.ture = turu;
	}
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTure() {
		return ture;
	}

}
