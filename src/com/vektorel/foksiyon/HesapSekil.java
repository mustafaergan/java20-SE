package com.vektorel.foksiyon;

public class HesapSekil {
	
	public static void main(String[] args) {
		ekranaSekilBas(5);
		toplama(10,15);
		ekranaSekilBas(10);
		cikarma(15,10);
		ekranaSekilBas(15);

	}
	
	public static void ekranaSekilBas(int sayi){
		for(int i = 0 ; i <sayi; i++){
			System.out.print("*");
		}
		System.out.println("asd");
	}
	
	public static void toplama(int sayi1, int sayi2){
		int sonuc = sayi1 + sayi2;
		System.out.println(sonuc);
	}
	
	public static void cikarma(int sayi1, int sayi2){
		int sonuc = sayi1 - sayi2;
		System.out.println(sonuc);
	}


}
