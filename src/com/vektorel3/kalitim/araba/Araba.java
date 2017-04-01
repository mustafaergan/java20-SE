package com.vektorel3.kalitim.araba;

public class Araba {
	
	protected void motor(){
		System.out.println("Motor Çaliþti");
	}
	
	protected void yakitTukeme(){
		System.out.println("6 LT");
	}
	
	private int arrayToplama(int[] array){
		int toplam = 0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		return toplam;
	}
	
	public int ortalamaYakitTuketimi(int[] yakit){
//		int ortalama = 0;
//		for (int i = 0; i < yakit.length; i++) {
//			ortalama += yakit[i];
//		}
//		ortalama = ortalama/yakit.length;
		
		return this.arrayToplama(yakit)/yakit.length;
	}
	
	public String ortalamaYakitTuketimi(int[] yakit, int[] toplamKm) {
		int ortalama = this.arrayToplama(yakit)/yakit.length;
//		for (int i = 0; i < yakit.length; i++) {
//			ortalama += yakit[i];
//		}
//		ortalama = ortalama/yakit.length;
		
//		int toplam = 0 ;
//		for (int i = 0; i < toplamKm.length; i++) {
//			toplam += toplamKm[i];
//		}
		String s = "Km:" +ortalama + " Ortalma:"+arrayToplama(toplamKm);
		return s;
	}
	
	public void teker(){
		System.out.println("teker");
	}

}
