package com.vektorel3.koleksiyonlar.list.egoveritabani;

public class Ego {
	int id;
	String plaka;
	String tur;
	
	public Ego(int id, String plaka, String tur) {
		this.id =id;
		this.plaka = plaka;
		this.tur = tur;
	}
	
	public int getId() {
		return id;
	}
	public String getPlaka() {
		return plaka;
	}
	public String getTur() {
		return tur;
	}

}
