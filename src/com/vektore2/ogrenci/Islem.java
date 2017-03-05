package com.vektore2.ogrenci;


public class Islem {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenciMustafa = new Ogrenci();
		
//		ogrenciMustafa.TC = 1000;
//		ogrenciMustafa.ismi = "mustafa";
//		ogrenciMustafa.soyisim = "mustafa";
//		
		ogrenciMustafa.ogrenciYazdir();
		
		Ogrenci ogrenciOnur = new Ogrenci();
		
		ogrenciOnur.TC = 10001;
		ogrenciOnur.soyisim = "Onur";
		
		ogrenciOnur.ogrenciYazdir();
		
		foksiyon();
		
		System.out.println(ogrenciOnur.soyisim);
		System.out.println(ogrenciMustafa.soyisim);
		
		Ogretmen ogretmenUmut = new Ogretmen();
		ogretmenUmut.tc = 10;
		ogretmenUmut.ogretmenId = 1;
		
		Ogretmen ogretmenTamer = new Ogretmen(); 
		ogretmenTamer.isim= "tamer";
		
		System.out.println(ogretmenUmut.ogretmenId);
		
		System.out.println(ogretmenTamer);
		
	}

	public static void foksiyon() {
		Ogrenci ogrenciOnur = new Ogrenci();
		System.out.println("foksiyon içi");
		ogrenciOnur.ogrenciYazdir();
		
	}

}
