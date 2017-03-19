package com.vektore2.spor;

public class Islem {
	
	public static void main(String[] args) {
		
		Buzhokeyi buzhokeyi = new Buzhokeyi();
		
		buzhokeyi.setHakemSayisi(10);
		buzhokeyi.setOyuncuSayisi(10);
		
		Futbol futbol = new Futbol();
		
		futbol.setHakemSayisi(5);
		futbol.setOyuncuSayisi(11);
		
		Spor spor = new Spor();
		
		spor.sporBilgiVer(buzhokeyi);
		spor.sporBilgiVer(futbol);

		
		
	}

}
