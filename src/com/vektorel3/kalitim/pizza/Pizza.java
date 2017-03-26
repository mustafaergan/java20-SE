package com.vektorel3.kalitim.pizza;

public class Pizza extends Hamur {
	
	private int mazemeSayisi=5;
	
	public void pizzaYap(){
		super.hamurunYap();
		System.out.println(this.mazemeSayisi);
	}
	
	@Override
	public void hamurunYap() {
		System.out.println("pizza sýnýfý hamur yap foksiyonu");
		super.hamurunYap();
	}
	

}
