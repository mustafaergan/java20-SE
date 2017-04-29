package com.vektorel3.koleksiyonlar.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListArray {
	
	public static void main(String[] args) {
		
		List<String> myList = new LinkedList<>();
		
		myList.add("mustafa");
		myList.add("mustafa");
		myList.add("ahmet");
		myList.add("hasan");
		myList.add("mahmut");
		System.out.println(myList);
		myList.remove("mustafa");

		System.out.println(myList);
//		System.out.println(myList.size());
//		System.out.println(myList.get(0));
		
		
//		for (int i = 0; i < myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
//		
//		Iterator<String> ite = myList.iterator();
//		while (ite.hasNext()) {
//			String veri = ite.next();
//			System.out.println(veri);
//		}
//		
//		for (String veri : myList) {
//			System.out.println();
//		}
//		
//		List<Dershane> dershaneList = new ArrayList<>();
//		
		
		
	}
	

}
