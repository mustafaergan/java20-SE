package com.vektorel.array;

import java.util.Scanner;

public class DiziDoldur {
	
	public static void main(String[] args) {
		
		double[] a = diziDoldur();
		
		diziOku(a);
		
		diziOkuUsttu(a,3);
		
		diziOku(a);
	}
	
	public static double[] diziDoldur(){
		double[] array = new double[3];
		Scanner scanner = new Scanner(System.in);
		
		double deger ;
		for(int i = 0 ; i < array.length ; i ++){
			deger = scanner.nextDouble();
			array[i] = deger;
		}
		return array;
	} 
	
	public static void diziOku(double[] array){
		for(int i = 0 ; i < array.length ; i ++){
			System.out.println(array[i]);
			double veri = array[i];
		}
		
		for(double veri : array){
			System.out.println(veri);
		}
	}
	
	public static void diziOkuUsttu(double[] array, int ust){
		for(int i = 0 ; i < array.length ; i ++){
			System.out.println(Math.pow(array[i], ust));
		}
	}
	

}
