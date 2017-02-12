package com.vektorel.switchdeneme;

import java.util.Scanner;

public class KodBarkod {
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		String barkod = oku.nextLine();
		int yil = oku.nextInt();
		
		switch (barkod.toLowerCase()+"-"+yil) {
		case "java20-2017":
			System.out.println("Açýk Kur");
			break;
		case "java19-2016":
			System.out.println("Kapalý Kur");
			break;
		case "java21-2018":
			System.out.println("Açýlacak Kur");
			break;
		default:
			System.out.println("geçersiz veri");
			break;
		}
	}

}
