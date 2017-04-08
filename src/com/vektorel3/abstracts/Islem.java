package com.vektorel3.abstracts;

public class Islem {
	
	public static void main(String[] args) {
		VergiCankaya vergi = new VergiCankaya();
		
		System.out.println(vergi.ticariVergiHesapla(110));
		
//		AVergilendirmeHesaplari a = new AVergilendirmeHesaplari();
//		
//		a.ticariVergiHesapla(1000);
		
		VergiCankaya vergii = new VergiCankaya();
		
		
		vergii.kdvHesapla(100);
		
		vergii.abstractDeneme();
	}
	
	


}
