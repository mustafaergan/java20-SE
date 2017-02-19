package com.vektorel.dongu;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		
		int kontrol = oku.nextInt();
		
		for(int i = (kontrol); 0 < i; i-- ){
			
//			if(i%2 == 1 ){
//				System.out.print(i + " ");
//			}
			
			if(i%2 == 0 ){
				System.out.print(i + " ");
			}

			
		}
		
		System.out.println("");
		for(int i = 1; i <= kontrol ; i++ ){
			
			if(i%2 == 0 ){
				System.out.print(i + " ");
			}
		}
		
	}
}
