package com.vektore2.cevre;

public class Park {
	
	int agacSayisi;
	String ismi;
	
	public void setAgacSayisi(int agacSayisi) {
		this.agacSayisi = agacSayisi/2;
	}
	
	public void setIsmi(String ismi) {
		this.ismi ="15 Temmuz " + ismi;
	}
	
	
	public int getAgacSayisi() {
		return this.agacSayisi;
	}
	
	public String getIsmi() {
		return this.ismi;
	}
	
	
	

}
