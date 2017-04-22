package com.vektorel3.koleksiyonlar;

import java.util.HashSet;

public class Islem {
	
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		HashSet<String> myArray = new HashSet<String>();
		if(myArray.isEmpty()) 
			System.out.println("boþ array");
		
		myArray.add("Mustafa");
		myArray.add("Hacer");
		myArray.add("Ersan");
		myArray.add("Cemal");
		myArray.add("Namýk");
		myArray.add("Mehmet");
		myArray.add("Hikmet");
		if(myArray.add("Mustafa")) {
			System.out.println("Eklendi");
		}

//		if(myArray.add("Ahmet")) {
//			System.out.println("Eklendi");
//		}
		
		System.out.println(myArray);
		
		System.out.println(myArray.size());
		
//		System.out.println(myArray.remove("Mustafa"));
		
		if(myArray.remove("Mustafa"))
			System.out.println("silindi");

		
		System.out.println(myArray);
		
		if(!myArray.isEmpty()) 
			System.out.println("dolu array");
		
		myArray.clear();
		
		System.out.println(myArray);
		
		for (int i = 0; i < a.length; i++) {
			
		}

	}

}
