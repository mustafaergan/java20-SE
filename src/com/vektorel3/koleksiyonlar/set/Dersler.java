package com.vektorel3.koleksiyonlar.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Dersler {
	
	public static void main(String[] args) {
		Set<String> myHash = new HashSet<>();
		myHash.add("Fizik");
		myHash.add("Kimya");
		myHash.add("Matematik");
		
		myHash.remove("Fizik");
		
		System.out.println(myHash);
		
		Set<Integer> dersKodlar = new HashSet<>();

		dersKodlar.add(10);
		dersKodlar.add(20);
		
		Iterator<String> myIterator= myHash.iterator();
		
		while(myIterator.hasNext()){
			System.out.println(myIterator.next());
		}
		
		Iterator<Integer> myIteratorKodlar = dersKodlar.iterator();

		
//		while(myIteratorKodlar.hasNext()){
			System.out.println(myIteratorKodlar);
//			System.out.println(myIteratorKodlar.next());
//			System.out.println(myIteratorKodlar.next());
//			System.out.println(myIteratorKodlar.next());

//		}
		
	}

}
