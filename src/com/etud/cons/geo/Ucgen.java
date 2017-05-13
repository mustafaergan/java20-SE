package com.etud.cons.geo;

public class Ucgen {
	int birinciKenar;
	int ikinciKenar;
	int ucuncuKenar;
	
	/**
	 * Es kenar ucgen icindir
	 */
	public Ucgen(int kenar) {
		this.birinciKenar = kenar;
		this.ikinciKenar = kenar;
		this.ucuncuKenar = kenar;
	}
	
	/**
	 * ikiz kenar ucgen icindir
	 */
	public Ucgen(int esKenar,int altKenar) {
		this.birinciKenar = esKenar;
		this.ikinciKenar = esKenar;
		this.ucuncuKenar = altKenar;
	}
	
	/**
	 * cesit kenar ucgen icindir
	 */
	public Ucgen(int birinciKenar,int ikinciKenar,int ucuncuKenar) {
		this.birinciKenar = birinciKenar;
		this.ikinciKenar = ikinciKenar;
		this.ucuncuKenar = ucuncuKenar;
	}
	
	public int cevreHesapla() {
		return this.birinciKenar+this.ikinciKenar+this.ucuncuKenar;
	}
	
}
