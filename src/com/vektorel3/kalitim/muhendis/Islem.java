package com.vektorel3.kalitim.muhendis;

public class Islem {
	
	public static void main(String[] args) {
		
		BilgisayarMuhendisi bilgisayarMuhendisi = new BilgisayarMuhendisi();
		
//		System.out.println(bilgisayarMuhendisi.degisken);
		
		bilgisayarMuhendisi.setDegisken(10);
		
		bilgisayarMuhendisi.setDiploma("Gazi Üniversite");
		
		System.out.println(bilgisayarMuhendisi.getDiploma());
	}

}
