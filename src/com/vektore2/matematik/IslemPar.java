package com.vektore2.matematik;

public class IslemPar {

	public static void main(String[] args) {
		ParalelKenar paralelKenar = new ParalelKenar(10,10,8);
		
		int sonuc = paralelKenar.alanHesapla();
		
		System.out.println(sonuc);
		
		ParalelKenar paralelKenar2 = new ParalelKenar(8,6);

		sonuc = paralelKenar2.alanHesapla();
		
		System.out.println(sonuc);
		
		
	}
	
}
