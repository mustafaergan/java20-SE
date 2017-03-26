package com.vektorel3.kalitim.ulasim;

public class Islem {
	
	public static void main(String[] args) {
		
		Otoyol otoyol = new Otoyol();
		
		otoyol.setIsmi("akýncýlar");
		otoyol.setSeritSayi(8);
		otoyol.setTipi("asfalt");
		otoyol.setHizSiniri(120);
		otoyol.hizSinir();
		
		KoyYolu koyYolu = new KoyYolu();
		
		koyYolu.setIsmi("Entel Köy Yolu");
		koyYolu.setSeritSayi(1);
		koyYolu.setTipi("Mucur");
		koyYolu.setHizSiniri(50);
		
		koyYolu.hizSinir();
		
		System.out.println(otoyol.getIsmi() + " " + otoyol.getSeritSayi());
		
		System.out.println(koyYolu.getIsmi() + " " + koyYolu.getSeritSayi());

		int[] array = {100,200,100};
		
		int sonuc1 = otoyol.yolHesapla(array);
		
		
		int sonuc2 = koyYolu.yolHesapla(array);
		
		
		int sureKoy = koyYolu.sureHesap(sonuc2);
		
		int sureOtotyol = otoyol.sureHesap(sonuc1);

		
		System.out.println("sonuc 1 "+sonuc1 + " sonuc 2 " + sonuc2);
		
		
		System.out.println("sure koy yolu "+sureKoy + " sure otoyol "+ sureOtotyol);
		
		
	}

}
