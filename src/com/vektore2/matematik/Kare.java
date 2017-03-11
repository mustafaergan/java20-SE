package com.vektore2.matematik;

public class Kare {
	int kenar;
	
	public int alanHesapla(){
//		this.kenar = kenar;
		int sonuc = this.kenar * this.kenar;
		return sonuc;
	}
	
	public int cevreHesapla(){
		int sonuc = this.kenar * 4 ;
		return sonuc;
	}
	
	
	public double kosegenUzunluguHesapla(){
		double sonuc = ((double)this.kenar) * Math.sqrt(2);
		return sonuc;
	}

//	cevreHesapla();
//	
//	KosegenUzunlugu();
//	
	
	public void setKenar(int kenar) {
		this.kenar = kenar;
	}
	
	public int getKenar() {
		return kenar;
	}

}
