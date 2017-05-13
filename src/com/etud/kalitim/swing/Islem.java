package com.etud.kalitim.swing;

public class Islem {
	
	public static void main(String[] args) {
		PersonKayitEkrani kayit = new PersonKayitEkrani();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		kayit.labelIsimDegistirme();
	}

}
