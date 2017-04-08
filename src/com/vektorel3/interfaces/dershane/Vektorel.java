package com.vektorel3.interfaces.dershane;

public class Vektorel implements IKurs, IHoca {

	@Override
	public void ogrenci() {
		System.out.println("ogrenci");
	}

	@Override
	public void hoca() {
		System.out.println("hoca");
	}
	
	@Override
	public void muhasebe(){
		System.out.println("para");
	}

}
