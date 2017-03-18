package com.vektore2.ulasim;

public class Otobus {
	private String model;
	public String numara;
	public int ayakYolcu;
	public int oturanYolcu;
	public int yolcuMiktari;
	
	public Otobus(String model, String numara, int ayakYolcu, int oturanYolcu, int yolcuMiktari) {
		this.model = model;
		this.numara = numara;
		this.ayakYolcu = ayakYolcu;
		this.oturanYolcu = oturanYolcu;
		this.yolcuMiktari = yolcuMiktari;
	}
	
	public int kacTaneYolcuAlabilir(){
		int sonuc = (this.oturanYolcu + this.ayakYolcu) - yolcuMiktari;
		return sonuc;
	}
	
	
	

}
