package com.vektorel.dongu;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		int sayac = 4;
		
		 do{
			--sayac;
		
			System.out.print(sayac + " ");
			
		}while (sayac>=5);
		
		System.out.println("yolun sonu");
		
		
		Scanner oku = new Scanner(System.in);
		System.out.print("**** Ikýnci Ornek****");
		int x = oku.nextInt();
		
		int y = oku.nextInt();
		
		do{
			System.out.print(x);
			x--;
		}while(y<=x);
		
	}

}
