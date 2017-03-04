package com.vektorel.stringvetipdonusumleri;

public class StringIslemleri {

	
	public static void main(String[] args) {
		
		String deger = "vek#to#rel";
		
		System.out.println(deger.length());
		
		System.out.println(deger.indexOf("o"));
		
		System.out.println(deger.substring(0, 3));
		
		System.out.println(deger.toLowerCase());
		
		System.out.println(deger.toUpperCase());
		
		String[] dizi = deger.split("o");
		
		System.out.println("dizi0 " + dizi[0] + " dizi1 " +dizi[1]);
		
	}
	
}
