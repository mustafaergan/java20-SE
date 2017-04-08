package com.vektorel3.kalitim.spor;

public class Spor implements ISpor {
	
	public Spor(int a){
		System.out.println("spor cons" +a);
	}

	@Override
	public void hakem() {
		System.out.println("hakem");
		
	}

	@Override
	public void sporcu() {
		System.out.println("sporcu");
	}
	
	
	protected void hakemeMudahale(){
		System.out.println("dokunma");
	}
	
	void packagePrivate(){
		System.out.println("package");
	}
	
	

}
