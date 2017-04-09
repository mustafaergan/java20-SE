package com.vektorel3.trycatch.karma;

import java.util.Scanner;

public class Karma {
	public static void main(String[] args) {
//		try{
//			bolme(10,0);
//
//		}catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
//		
//		try{
//			arrrayDoldur();
//
//		}catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		
//		try{
//			parse();
//
//		}catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
//		
//		try{
//			nullHatasi();
//		}catch (NullPointerException e) {
//			e.printStackTrace();
//		}
//		
//		try{
//			String ss = nullString();
//			parse(ss);
//		}catch (NullPointerException e) {
//			e.printStackTrace();
//		}catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
		
//		try{
//			String ss = nullString();
//			parse(ss);
//		}catch (NullPointerException | NumberFormatException e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("");
//		}
		
		
		System.out.println("yola devam");
		
		String password  ="";
		int passwordInt = 0 ;
		try{
			password = getPassword();
			passwordInt = Integer.parseInt(password);
			login();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			password = "";
			passwordInt = 0;
		}
		
		System.out.println(password);
		System.out.println(passwordInt);

		
	}

	private static void login() {
		System.out.println("basarili");
		
	}

	private static String getPassword() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();		
		return s;
	}

	private static void nullHatasi() {
		String s = null;
		s.length();
	}
	
	private static String nullString() {
		String s = "veri";
		s.length();
		return s;
	}

	private static void parse() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int a = Integer.parseInt(s);
	}
	
	private static void parse(String veri) {
		int a = Integer.parseInt(veri);
	}

	private static void arrrayDoldur() {
		int[] myArray = new int[1];
		myArray[5] = 10;
	}

	private static int bolme(int i, int j) {
		return i/j;
	}
	

}
