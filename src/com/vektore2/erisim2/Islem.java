package com.vektore2.erisim2;

public class Islem {
	
	public static void main(String[] args) {
		
		Silah silah = new Silah();
		
		silah.atesleme();
		
		silah.tekliklme();
		
		System.out.println(silah.emniyet);
		
		System.out.println(silah.marka);
		
		silah.marka = "abc";
		
//		silah.PI  =3.15;
		
	}

}
