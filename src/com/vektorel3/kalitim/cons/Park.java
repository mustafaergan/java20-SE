package com.vektorel3.kalitim.cons;

public class Park extends Orman implements IPark {
	
	public Park(String parkAdi){
		super(parkAdi);
		System.out.println("park " + parkAdi);
	}

	@Override
	public void insan() {
		System.out.println("insan");
	}

	@Override
	public void hayvan() {
		System.out.println("hayvan");
		
	}

}
