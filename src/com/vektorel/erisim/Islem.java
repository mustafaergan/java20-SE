package com.vektorel.erisim;

import com.vektore2.erisim.Ogrenci;
import com.vektore2.erisim2.Silah;

public class Islem {
	
	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci();
		
		ogrenci.deneme();
		
		ogrenci.konusma();
		
		int a = ogrenci.id;

//		String no = ogrenci.ogrenciNo;
		
		Silah silah = new Silah();

		silah.atesleme();
		
		System.out.println(silah.emniyet);
		
		System.out.println(silah.emniyet);

	}

}
