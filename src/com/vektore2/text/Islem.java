package com.vektore2.text;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		String[] dizi = {"Vektorel", "Java", "20"};
		TextBirlestir textBirlestir = new TextBirlestir(dizi);
		String veri = textBirlestir.birlestir();
		System.out.println(veri);
		
		TextBirlestir textBirlestir2 = 
				new TextBirlestir("Vektorel", "Java", "19");

		veri = textBirlestir2.birlestir();
		
		System.out.println(veri);
		
		
		TextBirlestir textBirlestir3 = 
				new TextBirlestir("Vektorel", "Java");

		veri = textBirlestir3.birlestir();
		
		Scanner scan = new Scanner(System.in);
		char i = scan.next().charAt(0);
		
		
		System.out.println(veri);
	}
}
