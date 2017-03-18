package com.vektore2.ulasim;

public class Islem {
	
	public static void main(String[] args) {
		
		Otobus otus197 = new Otobus("man", "197", 100, 100, 80);
		otus197.ayakYolcu = 100;
		otus197.oturanYolcu = 100;
		
		
		Yolcu yolcuFatmaTeyze = new Yolcu("Fatma", 1012);
		
		yolcuFatmaTeyze.hangiOtobustesin(otus197);
//		
//		Otobus otus220 = new Otobus("man", "220", 50, 120, 160);
//
//		yolcuFatmaTeyze.hangiOtobustesin(otus220);
		
	}

}
