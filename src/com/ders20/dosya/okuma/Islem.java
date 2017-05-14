package com.ders20.dosya.okuma;

import java.io.File;
import java.util.List;

public class Islem {
	
	public static void main(String[] args) {
		Okuyucu okuyucu = new Okuyucu();
//		File file = okuyucu.dosyaAl("D:\\MustafaHoca\\workspace\\FirstProject\\src\\com\\vektorel5\\dosya\\Islem.java");
		File file = okuyucu.dosyaAl("C:/mustafa/kisiler.txt");

		List<String> myList = okuyucu.oku(file);
		
		for (String veri : myList) {
			System.out.println(veri);
			
		}
	}

}
