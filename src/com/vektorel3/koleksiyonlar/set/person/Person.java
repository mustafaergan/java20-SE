package com.vektorel3.koleksiyonlar.set.person;

public class Person {
	int TC;
	String adi;
	String soyadi;
	
	
	public Person(int TC, String adi, String soyadi) {
		this.TC = TC;
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	public int getTC() {
		return TC;
	}
	public void setTC(int tC) {
		TC = tC;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	

}
