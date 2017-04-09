package com.vektorel3.trycatch;

import java.util.Scanner;

public class ZeroError {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try{
			int a =bolme(scanner.nextInt(),scanner.nextInt());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("merhaba dünya");
	}

	private static int bolme(int a, int b) {
		return a/b;
	}

}
