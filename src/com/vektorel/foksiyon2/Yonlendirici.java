package com.vektorel.foksiyon2;

import java.util.Scanner;

public class Yonlendirici {

	public static void main(String[] args) {
		System.out.println("main foksiyonu caliþti");
		int veriAl = veriAl();
		yonlendirici(veriAl);
		System.out.println("main foksiyonu bitti");
	}

	public static void yonlendirici(int veri) {
		System.out.println("yonlendirici foksiyonu caliþti");
		if(tekMI(veri)){
			System.out.println("tek");
		}else if(ciftMI(veri)){
			System.out.println("cift");
		}else{
			return;
		}
		
	}

	private static boolean ciftMI(int veri) {
		System.out.println("cift foksiyonu caliþti");
		if(veri % 2 == 0){
			return true;
		}
		return false;
	}

	public static boolean tekMI(int veri) {
		System.out.println("tek foksiyonu caliþti");
		if (veri % 2 == 1) {
			return true;
		}
		return false;
	}

	public static int veriAl() {
		System.out.println("veriAl foksiyonu caliþti");
		Scanner scan = new Scanner(System.in);
		int sonuc = scan.nextInt();
		return sonuc;

	}

}
