package com.vektore2.cevre;

public class Ev {
	
	int kacOda = 1;
	double metreKAre;
	boolean bahceVarMý;
	String adres;
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public void setBahceVarMý(boolean bahceVarMý) {
		this.bahceVarMý = bahceVarMý;
	}
	
	public boolean getBahceVarMý(){
		return this.bahceVarMý;
	}

	public int getKacOda() {
		return kacOda;
	}

	public void setKacOda(int kacOda) {
		this.kacOda = kacOda;
	}

	public double getMetreKAre() {
		return metreKAre;
	}

	public void setMetreKAre(double metreKAre) {
		this.metreKAre = metreKAre;
	}

	public String getAdres() {
		return adres;
	}

}
