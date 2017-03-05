package com.vektore2.cevre;

public class Lokanta {
	String isim;
	int masaSayi = 5;
	String turu;
	String adres;
	
	public void birFoksiyon(){
		
		int masaSayi = 6;
		
		System.out.println(masaSayi);
		
		System.out.println(this.masaSayi);
		
		masaSayi = 10;
		
		System.out.println(masaSayi);
		System.out.println(this.masaSayi);
		
		this.masaSayi = 15;
		
	}
	
}
