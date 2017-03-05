package com.vektore2.ogrenci;

public class Islem3 {
	
	public static void main(String[] args) {
		
		Hizetmeli hizetmeli = new Hizetmeli();
		hizetmeli.id = 10;
		hizetmeli.isim ="ayse";
//		hizetmeli.isimYazdir();
//		hizetmeli.idVerisiAta(20);
//		System.out.println(hizetmeli.id);
		
		String isimYeni = hizetmeli.isimArtiVektorel();
		
		System.out.println(isimYeni);
	}
	


}
