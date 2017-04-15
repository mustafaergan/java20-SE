package com.vektorel3.trycatch.mustafahatasi;

public class MyString {
	
	public static void main(String[] args) {
		
		String mes = "musTafaçiI";
		
		System.out.println(mes.toUpperCase());
		System.out.println(mes.toLowerCase());
		String my = mes.substring(2, 5);
		System.out.println(my);
		//{mustafa:ergan,tc:1000,me:1234}
		char c = mes.charAt(0);
		System.out.println(c);
		System.out.println(mes.length());
		
		char [] array = mes.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			char cc = array[i];
			System.out.println("dizi içi :"+cc);
		}
	}
}
