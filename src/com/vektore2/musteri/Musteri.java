package com.vektore2.musteri;

import com.vektore2.lokanta.NustrEt;
import com.vektore2.lokanta.RecepUsta;

public class Musteri {
	private int id;
	
	public RecepUsta recepUstaOlustur(){
		RecepUsta recepUsta = new RecepUsta();
		recepUsta.garsonSayisi = 10;
		recepUsta.masaSayi = 5;
		return recepUsta;
	}
	
	public int veriDonder(){
		return 5;
	}
	
	public void recepUstayiAra(){
		RecepUsta recepUsta = recepUstaOlustur();
		
		System.out.println(recepUsta.masaSayi);
	}
	
	public void recepUstayiInternet(){
		RecepUsta recepUsta = recepUstaOlustur();
		
		System.out.println(recepUsta.masaSayi);
	}
	
	public void nusretAra(NustrEt nustrEt){
		nustrEt.etMiktarýSorgula();
		System.out.println(nustrEt.garsonSayisi);
	}
	
	public void nusretInternet(NustrEt nustrEt){
		System.out.println(nustrEt.garsonSayisi);
	}
}
