package com.ders21.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Islem {
	
	public static void main(String[] args) {
		
		Map<Integer,String> ogrenciler = new TreeMap<>();
		
		ogrenciler.put(1, "Hilal");
		ogrenciler.put(3, "Mehmet");
		ogrenciler.put(2, "Muhammed");
		ogrenciler.put(4, "Cemal");
		System.out.println(ogrenciler);
		ogrenciler.put(4, "Hikmet");
		System.out.println(ogrenciler);
		ogrenciler.put(1, "Mustafa");
		System.out.println(ogrenciler);
		ogrenciler.put(5, "Hikmet");
		System.out.println(ogrenciler);

		System.out.println(ogrenciler.get(4));
		

		Iterator<Entry<Integer,String>> iterator 
		= ogrenciler.entrySet().iterator();
		while(iterator.hasNext()){
			Entry en = iterator.next();
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
		System.out.println("foreach");
		for (Integer veri : ogrenciler.keySet()) {
			System.out.println(veri);
		}
		
		System.out.println("foreach**");
		for (Entry<Integer, String> veri : ogrenciler.entrySet()) {
			System.out.println(veri.getKey());
			System.out.println(veri.getValue());

		}
		
		System.out.println("-----");
		for (String ss : ogrenciler.values()) {
			System.out.println(ss);
		}
		
		//jdk 1.8
		System.out.println("^^");
		ogrenciler.forEach((k,v) -> 
		System.out.println("value:"+v));
		
		
	}

}
