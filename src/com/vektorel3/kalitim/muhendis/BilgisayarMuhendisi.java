package com.vektorel3.kalitim.muhendis;

public class BilgisayarMuhendisi extends Muhendis {
	
	private int degisken;
	
	public void bil() {
		System.out.println("Bilgisayar bilgim iyi");

	}
	
	public void setDegisken(int degisken) {
		this.degisken = degisken;
	}
	
	public int getDegisken() {
		return degisken;
	}

}
