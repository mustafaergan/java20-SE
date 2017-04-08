package com.vektorel3.kalitim.spor;

public class Basketbol extends Spor {
	
	
	public Basketbol(){
		super(1);
		System.out.println("basketbol cons");
	}
	
	public void deneme(){
		hakemeMudahale();
		packagePrivate();
		
		super.sporcu();
	}

}
