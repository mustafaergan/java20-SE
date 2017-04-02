package com.vektorel3.interfaces.gezegen;

public class Gezegen implements Doga {

	@Override
	public void tahta() {
		System.out.println("tahta");
	}

	@Override
	public void ates() {
		System.out.println("ates");
	}

	@Override
	public void toprak() {
		System.out.println("toprak");
	}

	@Override
	public void su() {
		System.out.println("su");
	}
	
	public void gezegeniKutar(){
		tahta();
		ates();
		toprak();
		su();
	}

}
