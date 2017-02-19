package com.vektorel.foksiyon;

import java.util.Scanner;

public class Faktoriyel {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 5;
		int c = faktoriyel(a);
		System.out.println("diþarý:" +c);
		enBuyukBul(10,15);
//		asalBul(5);
	}
	
	public static int faktoriyel(int nextInt) {
		int sonuc = 1;
		
		for(int i = 1; i<nextInt ; i++ ){
			int veri = i*sonuc;
			sonuc = sonuc + veri;
			//sonuc = sonuc + (i*sonuc);
			//sonuc += i*sonuc
		
		}
		System.out.println("içeri:"+sonuc);
		return (karasiniAl(sonuc)+2)+(karasiniAl(2));
//		return 10*5*2+2-10;
	}
	
	public static int karasiniAl(int sayi){
		return (sayi*sayi);
	}

	public static void asalBul(int asalSayiMi) {
		boolean control = true;
		for(int i = 2 ; i < asalSayiMi ; i++){
			if(asalSayiMi % i == 0){
				System.out.println("bu sayi asal deðildir");
				control = false;
				break;
			}
		}
		if(control)
			System.out.println("bu sayi asaldir");
	}

	public static void enBuyukBul(int i, int j) {
		if(i > j){
			System.out.println("en büyük : " + i);
		}else{
			System.out.println("en büyük : "+ j);
		}
	}



}
