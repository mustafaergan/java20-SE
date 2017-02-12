package com.vektorel.dongu;

import java.util.Scanner;

public class Faktoreyel {
	
	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		
		int sinirDeger = oku.nextInt();
		
		int sayac = 1;
		
		int sonuc = 1;
		
		while(sayac <= sinirDeger){
			
			sonuc = sonuc * sayac;
			sayac++;
			
		}
		System.out.println(sonuc);
	}

}
