package com.vektorel.dongu;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
//		
//		int sayac = 0;
//		
//		boolean control = true;
//		
//		while(sayac < 5 && control){
//			System.out.println("*");
//			System.out.println("#");
//			System.out.println("--");
//			if(sayac == 1){
//				control = false;
//			}
//			sayac ++ ;
//		}
//		
//		System.out.println(sayac);
//		System.out.println("yoluna devam etti");
//		
		Scanner oku = new Scanner(System.in);
		
		
		int value = oku.nextInt();
		
		int sayac2 = 0;
		
		while(sayac2 < value){
			System.out.println("**");
			if(sayac2 == 5){
				break;
			}
			sayac2 ++;
		}
		
		int value2 = oku.nextInt();
		
		int sayac3 = 0;
		
		boolean control = true;
		
		while(sayac3 < value2 &&control){
			sayac3 ++;

			if(sayac3 == 3){
				continue;
			}
			
			System.out.println("##"+sayac3);
			
			if(sayac3 == 10){
				control = false;
			}
		}
		
		System.out.println(sayac3);
		
		
	}

}
