package com.vektorel.not;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		
		int ogrenciNot = -1;
		
		String deger = null;
		String ikinciIfade = "iki";
		
		Scanner oku = new Scanner(System.in);
		
		ogrenciNot = oku.nextInt();
		oku.nextInt();
		oku.nextInt();
		oku.nextInt();
		
		if(deger != null && deger.equals("vektorel")){
			System.out.println(deger);
		}
		
		
		if(ikinciIfade.equals("iki") || deger.equals("vektorel")){
			System.out.println(ikinciIfade);
		}
		
		
		
		if(ogrenciNot > 80 && ogrenciNot <= 100 && ogrenciNot == -1){
			System.out.println("AA");
		}
		
		if(ogrenciNot<=80 & ogrenciNot > 70){
			System.out.println("bb");
		}
		
		
		if(ogrenciNot<=70 & ogrenciNot > 50){
			System.out.println("cc");
		}
		
		if(ogrenciNot  < 50){
			System.out.println("ff");
		}
		
		if(ogrenciNot  == 0 | ogrenciNot  == -1){
			System.out.println("D1");
		}
		

	}

}
