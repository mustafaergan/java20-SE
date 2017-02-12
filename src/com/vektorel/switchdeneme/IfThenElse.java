package com.vektorel.switchdeneme;

import java.util.Scanner;

public class IfThenElse {
	
	
	public static void main(String[] args) {
		int a = 5;
		
		int b = 6;
		
		String veri = (a==b)?"java19":"java20";
		
		System.out.println(veri);

		int c = 5;
		int d = 1;
		
		int sonuc = (d==0)?0:(c/d);
		
		System.out.println(sonuc);
		
		Scanner oku = new Scanner(System.in);
		
		int pay = oku.nextInt();
		
		int payda = oku.nextInt();
		
		double bolmeSonuc = (payda == 0 )?(pay*payda):((double)pay/(double)payda);

		System.out.println(bolmeSonuc);
		
	}

}
