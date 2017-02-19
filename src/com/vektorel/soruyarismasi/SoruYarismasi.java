package com.vektorel.soruyarismasi;

import java.sql.Date;
import java.util.Scanner;

public class SoruYarismasi {
	
	public static void main(String[] args) {
		int skor = 0;
		
		int orjinalDogruCevapInt = soruSorInt(12);
		
		int kullanicinVerdigiCevapInt = cevapAlInt();
		
		if(orjinalDogruCevapInt == kullanicinVerdigiCevapInt)
			skor +=5;
		
		String orjinalDogruCevapString = soruSorString();
		
		String kullanicinVerdigiCevapString = cevapAlString();
		
		if(orjinalDogruCevapString.equals(kullanicinVerdigiCevapString)){
			skor +=10;
		}
		
		System.out.println("skor:" + skor);
		
		while(kontrol()){
			
		}
		
		for(int i = degeriAl();kontrol();Artirma(i)){
			
		}
		
	}

	private static Object Artirma(int i) {
		return Math.abs(i);
	}

	private static int degeriAl() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static boolean kontrol() {
		// TODO Auto-generated method stub
		return false;
	}

	private static String cevapAlString() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine().toLowerCase();
	}

	public static String soruSorString() {
		String cevap = "Ankara";
		System.out.println("Türkiyenin baþkenti?");
		return cevap.toLowerCase();
	}

	public static int cevapAlInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	public static int soruSorInt(int veri) {
		System.out.println(veri+" karesi nedir");
		int sonuc = (int) Math.pow(veri,2);
		return sonuc;
	}

}
