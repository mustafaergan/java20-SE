package com.vektorel3.interfaces.araba;

public class Usta {
	
	public static void main(String[] args) {
		
		ITamir tamir = new Volvo();
		
		tamir.yagKontrol();
		tamir.motorBakim();
		tamir.rot();
		
		Volvo volvo = new Volvo();
		volvo.gaz();
	}

}
