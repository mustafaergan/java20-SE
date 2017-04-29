package com.vektorel3.koleksiyonlar.set.hayvan;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Islem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashSet<Hayvan> myList = new LinkedHashSet<>();
		
		
		System.out.println("id girin");
		int veri = scan.nextInt();
		
		while(veri != 0){
			System.out.println("isim girin");
			String isim = scan.next();
			System.out.println("Tür girin");
			String tür = scan.next();
			Hayvan hayvan = createHayvan(veri,isim,tür);
//			Hayvan hayvan = new Hayvan(veri, isim, tür);
			myList.add(hayvan);
			System.out.println("id girin");
			veri = scan.nextInt();
		}
		System.out.println("Iterator");
		Iterator<Hayvan> myIterator = myList.iterator();
		
		while(myIterator.hasNext()){
			Hayvan hayvan1= myIterator.next();
			System.out.println(hayvan1.getName());
		}
		System.out.println("for");
		for (Hayvan hayvan : myList) {
			System.out.println(hayvan.getName());
		}
	
			
	}

	private static Hayvan createHayvan(int veri, String isim, String tür) {
		Hayvan hayvan = new Hayvan(veri,isim,tür);
		
		return hayvan;
	}

}
