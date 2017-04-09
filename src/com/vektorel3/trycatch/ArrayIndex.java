package com.vektorel3.trycatch;

import java.util.Scanner;

public class ArrayIndex {
	
	public static void main(String[] args) {
		
		int[] myArray = new int[2];
		
		try{
			arrayDoldur(myArray);

		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.next());
		
		System.out.println("devam eden kod");

	}

	private static void arrayDoldur(int[] myArray) {
		arrayDoldur2(myArray);
	
	}

	private static void arrayDoldur2(int[] myArray) {
		myArray [0] = 5;
		myArray [1] = 25;
		myArray [2] = 15;			
	}

}
