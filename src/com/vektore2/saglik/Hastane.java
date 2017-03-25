package com.vektore2.saglik;

public class Hastane {
	
	public void ameliyat(Doktor doktor, Hemsire hemsire){
		System.out.println("--cift PArametre-");

		System.out.println(doktor.getName());
		System.out.println(doktor.getTC());
		
		System.out.println(hemsire.getName());
		System.out.println(hemsire.getTC());

	}
	public void ameliyat(Doktor doktor){
		System.out.println("--Tek PArametre-");
		System.out.println(doktor.getName());
		System.out.println(doktor.getTC());
	}
	public void ameliyat(Doktor[] arrayDoktor) {
		
		System.out.println("--doktor Array");
		
		for (int i = 0; i < arrayDoktor.length; i++) {
			Doktor doktor = arrayDoktor[i];
			
			System.out.println(doktor.getName());
			System.out.println(doktor.getTC());
		}
	}
	
	public void ameliyat(int[] arrayDoktor) {
		
		System.out.println("--doktor Array");
		
		for (int i = 0; i < arrayDoktor.length; i++) {
			int a = arrayDoktor[i];
			System.out.println(a);
		}
	}	
}
