package com.vektorel3.kalitim.canlialemi;

import com.vektorel3.kalitim.muhendis.BilgisayarMuhendisi;

public class Islem {
	
	public static void main(String[] args) {
		Goril goril = new Goril();
		
		goril.ureme();
		
		goril.hareket();
		
		Memeliler memeliler = new Memeliler();
		
		memeliler.ureme();
		
//		memeliler.ziplamaya() eriþemez
		
		BilgisayarMuhendisi bilgisayarMuhendisi = new BilgisayarMuhendisi();
		
//		System.out.println(bilgisayarMuhendisi.degisken);
		
		
	}

}
