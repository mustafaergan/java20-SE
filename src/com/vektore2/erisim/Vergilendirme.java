package com.vektore2.erisim;

public class Vergilendirme {
	public int vergiDilimi = 20;
	private int hesapKesim = 10;
	private int degisken = 15;
	
	
	private int vergiHesabi(int degisken){
		
		int sonuc = vergiDilimi*hesapKesim*2%10*degisken;
		
		return sonuc;
		
	}
	
	
	public double halkAcikHEsaplama(){
		return (double)vergiHesabi(degisken);
	}
	

}
