package com.etud.kalitim.aile;

public class Cocuk extends Baba {

	String ismi;
	
	public Cocuk() {
		super("cocuktan gelen");
		System.out.println("Cocuk Nesnesi Olustu");
	}
	
	public Cocuk(String veri) {
		super("cocuktan gelen");
		ismi = veri;
//		super.gozRengi();
//		this.cocugunOzelligi();
	}
	
	
	public void cocugunOzelligi() {
		System.out.println("cocuk");
	}
}
