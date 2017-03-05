package com.vektore2.ogrenci;

public class Islem2 {
	
	Ogrenci ogrenciMustafa;

	
	public static void main(String[] args) {
		
		Ogrenci ogrenciMustafa = new Ogrenci();
		
		ogrenciMustafa.TC = 200;
		ogrenciMustafa.ismi = "mustafa";
		ogrenciMustafa.soyisim = "java";
		
		ogrenciMustafa.ogrenciYazdir();
		
		System.out.println(ogrenciMustafa);
		
		ogrenciMustafa = null;
		
		System.out.println(ogrenciMustafa);
		
		ogrenciMustafa = new Ogrenci();
		
		ogrenciMustafa.ogrenciYazdir();
		
		ogrenciMustafa = new Ogrenci();

		ogrenciMustafa = new Ogrenci();
		
		int a = 5;
		
		a =6;
		
		a=7;

		
		
		
	}

}
