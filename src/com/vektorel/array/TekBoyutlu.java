package com.vektorel.array;

import java.util.Scanner;

public class TekBoyutlu {
	
	public static void main(String[] args) {
		
		//{1,2,3,4,5}
		
		int[] dizi = new int[5];
		
		
		
		String[] arrayStringJAva20 = {"veri1","veri2","veri3"};
		char[] arrayCharJAva20 = {'a','b','c'};
		
		
		char[] benimKelimem = {'j','a','v','a','2','0'};
		
		String my ="";
		
		for(int i = 0 ; i < benimKelimem.length ; i++ ){
			my = my + benimKelimem[i];
		}
		
		
		double[] array = new double[5];
		double[] arrayDoubleJAva20 = {1.0,2.0,3.0};

		
		for(int i = 0 ; i <arrayDoubleJAva20.length ; i++ ){
			array[i] = arrayDoubleJAva20[i];
		}
		
		System.out.println(array);
		
		System.out.println("Benim kelimem " +my);
		
		
		

		
//		dizi[0]  = 1;
//		dizi[1]  = 2;
//		dizi[2]  = 3; 
		
		for(int i = 0 ; i < dizi.length;i++){
			dizi[i] =(int) Math.pow(i,3);
		}
		
		
		for(int i = 0 ; i < dizi.length;i++){
			System.out.println(dizi[i]);
		}
		
		
		System.out.println("------------------------");
		
		dizi = new int[10];
		
		for(int i = 0 ; i < dizi.length;i++){
			System.out.println(dizi[i]);
		}
		
//		for(int i = 0 ; i < dizi.length;i++){
//			System.out.println(dizi[i]);
//		}
		
//		for(int i = 0 ; i < dizi.length ; i=i+2){
//			dizi[i] = (int) Math.pow(5, 2);
//			System.out.println(dizi[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
