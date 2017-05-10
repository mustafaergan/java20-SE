package com.etud.cons.geo;

public class KAre {
	int kenarUzunlugu;
	
	public KAre() {
		System.out.println("Merhaba Ben Kare");
	}
	public KAre(String veri) {
		this(5);
		System.out.println("Merhaba Ben Kare " + veri);
		this.kenarUzunlugu = 5;
	}
	
	public KAre(String veri,String veri1) {
		System.out.println("Merhaba Ben Kare " + veri + veri1);
	}
	public KAre(int kenarUzunlugu) {
		System.out.println("Merhaba Ben Kare " + kenarUzunlugu);
	}
	
	
	
}
