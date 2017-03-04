package com.vektorel.stringvetipdonusumleri;

public class Dosnusumler {
	
	public static void main(String[] args) {
		
		String deger = "5.0";
		
		String deger0 = "5";
		
		double doubleDeger = Double.parseDouble(deger);
		
		int veri = Integer.parseInt(deger0);
		
		System.out.println(veri);
		
		System.out.println(doubleDeger + 1.0);
		
		Double doubleDegerWapper = 2147483647.0;
		
		String stringVeri = doubleDegerWapper.toString();
		
		System.out.println(stringVeri);
		
		
	}

}
