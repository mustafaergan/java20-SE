package com.vektore2.matematik;

public class IslemDik {

	public static void main(String[] args) {
		Dikdortgen dikdortgen = new Dikdortgen();
		
		dikdortgen.setKisaKenar(10);
		
		dikdortgen.uzunKenar = 15;
		
		System.out.println(dikdortgen.alanHesapla());
		
		System.out.println(dikdortgen.getKisaKenar());
		
		System.out.println(dikdortgen.getUzunKenar());
		
		System.out.println(dikdortgen.kosegenUzunluguHesapla());
		
		System.out.println(dikdortgen.alanHesaplaScanner());

		
	}
	
}
