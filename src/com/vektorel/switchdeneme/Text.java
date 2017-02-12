package com.vektorel.switchdeneme;

import java.util.Scanner;

public class Text {
	
	public static void main(String[] args) {
		String text = "Pazartesi";
		
		
		Scanner oku = new Scanner(System.in);
		
		String okuDegeri1 = oku.nextLine();
		int okuDegeri2 = oku.nextInt();
		
		switch (okuDegeri1.toLowerCase() +"-" +okuDegeri2) {
		case "pazartesi-2017":
			System.out.println("pazartesi geldi");
			break;
			
		case "salý":
			System.out.println("pazartesi geldi");
			break;

		default:
			System.out.println("geçersiz");
			break;
		}
		
		switch (oku.nextLine()) {
		case "dizin":
			System.out.println("dizini sil");
		case "dosya":
			System.out.println("dosya sil");
		case "file":
			System.out.println("file sil");
		}
		
	}

}
