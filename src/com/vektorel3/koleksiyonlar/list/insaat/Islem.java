package com.vektorel3.koleksiyonlar.list.insaat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Islem {
	
	public static void main(String[] args) {
		InsaatFirmasi[] insaatArray = firmaDoldur();
		
		List<InsaatFirmasi> myList = new ArrayList<>();
		
		for (int i = 0; i < insaatArray.length; i++) {
			myList.add(insaatArray[i]);
		}
		System.out.println("foreach");
		for (InsaatFirmasi insaatFirmasi : myList) {
			System.out.println(insaatFirmasi.getName());
		}
		System.out.println("for");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i).getName());
		}
		
		List<String> listt = banaListVer();
		String[] array = banaArrayVer(listt);
		
		
	}
	
	public static InsaatFirmasi[] firmaDoldur(){
		InsaatFirmasi f1 = new InsaatFirmasi(1,"bayer");
		InsaatFirmasi f2 = new InsaatFirmasi(2,"kocak");
		InsaatFirmasi[] insaat = {f1,f2};
		return insaat;
	}
	
	
	public static List<String> banaListVer(){
		List<String> myList = new LinkedList<>();
		myList.add("veri1");
		myList.add("veri2");
		return myList;
	}
	
	public static String[] banaArrayVer(List<String> myList){
		myList.add("veri1");
		myList.add("veri2");
		
		String[] array = new String[2];
//		for (String string : myList) {
//			array[]
//		}
		for (int i = 0; i < myList.size(); i++) {
			array[i] = myList.get(i);
		}
		return array;
	}
	

}
