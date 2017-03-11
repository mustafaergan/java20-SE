package com.vektore2.matematik;

public class Islem {
	
	public static void main(String[] args) {
		
		Kare kare = new Kare();
		
		kare.setKenar(10);
		
		int sonuc = kare.alanHesapla();
		
		System.out.println(sonuc);

		System.out.println(kare.cevreHesapla());
		
//		kare.setKenar(7);
		
		System.out.println(kare.kosegenUzunluguHesapla());
	}

}
