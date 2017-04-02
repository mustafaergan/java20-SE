package com.vektorel3.interfaces.bisiklet;

public class Islem {

	public static void main(String[] args) {
		
//		Bisiklet bisiklet = new Bisiklet();
//		
//		bisiklet.fren();
//		
//		bisiklet.diskFren();
//		
//		System.out.println("---------------");
//		
//		IBisikletli bissan = new Bisiklet();
//		
//		bissan.fren();
//		bissan.pedal();
//		bissan.pedal();
		
		IBisikletli bissan = new Bissan();
		
		bissan.fren();
		
		IBisikletli umit = new Umit();
		
		umit.fren();
		
	}
	
}
