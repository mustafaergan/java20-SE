package com.vektore2.matematik;

public class IslemCokgen {
	
	public static void main(String[] args) {
		
		Cokgen cokgen1 = new Cokgen(5, 6, 7, 8);
		
		int sonuc = cokgen1.cevreHesapla();
		
		System.out.println(sonuc);
		
		Cokgen cokgen2 = new Cokgen(5, 6, 7, 8,7);
		
		sonuc = cokgen2.cevreHesapla();
		
		System.out.println(sonuc);
		
		Cokgen cokgen3 = new Cokgen();
		sonuc = cokgen3.cevreHesapla();
		
		int[] dizi = {1,2,3,4,5,6};
		
		Cokgen cokgen4 = new Cokgen(dizi);
		
		sonuc = cokgen4.cevreHesapla();
		System.out.println(sonuc);

		
	}

}
