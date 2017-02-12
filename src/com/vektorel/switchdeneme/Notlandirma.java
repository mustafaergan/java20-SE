package com.vektorel.switchdeneme;

import java.util.Scanner;

public class Notlandirma {
	
	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		
		int veri = oku.nextInt();
		
		switch (veri) {
		case 1:
			System.out.println("kalýr");
			break;
		case 2:
			System.out.println("kötü");
			break;
		case 5:
			System.out.println("pekiyi");
			break;
		case 3:
			System.out.println("orta");
			break;
		case 4:
			System.out.println("iyi");
			break;

		default:
			System.out.println("gecersiz veri");
			break;
		}
		
		
	}

}
