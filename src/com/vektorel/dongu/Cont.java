package com.vektorel.dongu;

import java.util.Scanner;

public class Cont {
	
	public static void main(String[] args) {
		
		int sayac = -1;
		
		Scanner oku = new Scanner(System.in);
		
		int max = oku.nextInt();
		
		while(sayac<max){
			
			sayac ++;
			
			if(sayac == 3){
				continue;
			}
			
			System.out.print(sayac + " ");
		}
	
	}

}
