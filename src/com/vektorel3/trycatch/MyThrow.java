package com.vektorel3.trycatch;

import java.util.Scanner;

public class MyThrow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		try{
		if (b == 0) {
			throw new NumberFormatException("b hatili");
		} else {
			int sonuc = a / b;
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("mesaj");
		}
		
		System.out.println("program devam");
	}

}
