package com.vektore2.saglik;

public class Islem {
	
	public static void main(String[] args) {
		
		Doktor doktorMehmet = new Doktor();
		doktorMehmet.setName("Mehmet");
		doktorMehmet.setTC(1234);
		
		Doktor doktorHasan = new Doktor();
		doktorHasan.setName("Hasan");
		doktorHasan.setTC(1234);
		
		Hemsire hemsire = new Hemsire();
		hemsire.setTC(2231);
		hemsire.setName("Fatma");
		
		Hastane hastane = new Hastane();
		hastane.ameliyat(doktorMehmet, hemsire);
		hastane.ameliyat(doktorMehmet);
		
//		int[] array = new int[5];
//		array[0] = 0;
//		
		
		Doktor[] arrayDoktor = new Doktor[2];
		arrayDoktor[0] = doktorHasan;
		arrayDoktor[1] = doktorMehmet;
		
		hastane.ameliyat(arrayDoktor);

		
	}

}
