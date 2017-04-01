package com.vektorel3.kalitim.araba;

public class Islem {
	
	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		int[] yakit = {10,6,8,9};
		int[] toplamKm = {100,200,100};
		int ortalama = sedan.ortalamaYakitTuketimi(yakit);
		String kmString = sedan.ortalamaYakitTuketimi(yakit,toplamKm);

		System.out.println(ortalama);
		System.out.println(kmString);
		sedan.yakitTukeme();
		
		HB hb = new HB();
		
		hb.yakitTukeme();
		
	}

}
