package com.vektorel3.abstracts;

public abstract class AVergilendirmeHesaplari {
	
	public double kdvHesapla(int deger){
		return (deger*0.18);
	}
	
	public double ticariVergiHesapla(int deger){
		return (deger*0.35);
	}
	
	public abstract void abstractDeneme();
	

}
