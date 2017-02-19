package com.vektorel.toplamacikarma;

import java.util.Scanner;

public class Islem {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int birinciVeri = scan.nextInt();
		
		int ikinciVeri = scan.nextInt();

		String veri = scan.next();
		
		int sonuc = 0;
		
		switch (veri) {
		case "+":
			sonuc = birinciVeri + ikinciVeri;
			break;
			
		case "-":
			sonuc = birinciVeri - ikinciVeri;
			break;

		case "*":
			sonuc = birinciVeri * ikinciVeri;
			break;

		case "/":
			sonuc = ikinciVeri ==0 ? 0 :  birinciVeri / ikinciVeri;
			break;
		}
		
		System.out.println("sonuc "+sonuc);
		
	}

}
