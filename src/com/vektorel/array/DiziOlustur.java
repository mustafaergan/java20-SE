package com.vektorel.array;

import java.util.Scanner;

public class DiziOlustur {

	public static void main(String[] args) {
		
		char [] charDizisi = charDiziOlustur();
		String veri = stringDonusturChar(charDizisi);
		System.out.println(veri);
		double[] doubleDizisi =  doubleDiziOlustur();
		veri = stringDonusturDouble(doubleDizisi);
		System.out.println(veri);
		
	}

	public static String stringDonusturDouble(double[] doubleDizisi) {
		String veri ="";
		for(int i = 0 ; i <doubleDizisi.length ; i++ ){
			veri = veri + doubleDizisi[i]+"-";
		}
		return veri;
	}

	private static double[] doubleDiziOlustur() {
		Scanner scanner = new Scanner(System.in);
		
		double[] doubleDizi = new double[5];
		for(int i = 0 ; i < doubleDizi.length ; i++){
			doubleDizi[i] = scanner.nextDouble();
		}
		return doubleDizi;
	}

	public static String stringDonusturChar(char[] charDizisi) {
		String veri ="";
		for(int i = 0 ; i <charDizisi.length ; i++ ){
			veri = veri + charDizisi[i]+"-";
		}
		return veri;
	}

	private static char[] charDiziOlustur() {
		Scanner scanner = new Scanner(System.in);
		
		char[] charDizi = new char[5];
		String s = "abcde";
		char ch ;
		for(int i = 0 ; i < charDizi.length ; i++){
			 s = scanner.next();
			 ch =(char) s.charAt(0);
			 charDizi[i] = ch;
		}
		return charDizi;
		
	}
	
}
