package com.vektorel.dongu;

import java.util.Scanner;

public class MaxBulma {
	
	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		
		int max = oku.nextInt();
		
		int min = 2147483647;
		
		int gelen = 0;
		
		while(max!=0){
			System.out.println("donuyo");
			gelen = oku.nextInt();
			
			if(gelen == 0){
				break;
			}
			
			if(max < gelen)
				max = gelen;
			
			if(min > gelen)
				min = gelen;
		}
		
		System.out.println("max çýktý "+max);
		System.out.println("min çýktý "+min);
		
	}

}
