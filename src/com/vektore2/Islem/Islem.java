package com.vektore2.Islem;

import com.vektore2.lokanta.NustrEt;
import com.vektore2.musteri.Musteri;

public class Islem {

	public static void main(String[] args) {

		Musteri mustafa = new Musteri();

		mustafa.recepUstayiAra();

		Musteri onur = new Musteri();

		onur.recepUstayiAra();

		NustrEt nustrEt = new NustrEt();
//		nustrEt.masaSayi = 5;
//		nustrEt.garsonSayisi = 10;
		
		mustafa.nusretAra(nustrEt);

		mustafa.nusretInternet(nustrEt);

	}

}
