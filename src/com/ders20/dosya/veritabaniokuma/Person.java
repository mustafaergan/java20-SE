package com.ders20.dosya.veritabaniokuma;

public class Person {
	
	int TC;
	String isim;
	String soyad;
	
	public Person(String[] array) {
		this.TC = Integer.parseInt(array[0]);
		this.isim = array[1];
		this.soyad = array[2];
	}
	
	public void selamVer(){
		System.out.println("Merhaba Benim Adým" + this.isim);
	}
	
	public String getIsim() {
		return isim;
	}
	public String getSoyad() {
		return soyad;
	}
	
	@Override
	public String toString() {
		return getIsim()+"-"+getSoyad();
	}

}
