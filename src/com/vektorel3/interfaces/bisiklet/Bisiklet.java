package com.vektorel3.interfaces.bisiklet;

public class Bisiklet implements IBisikletli {

	@Override
	public void fren() {
		System.out.println("fren");
		diskFren();
	}

	public void diskFren() {
		System.out.println("disk fren");
		
	}

	@Override
	public void vites() {
		
	}

	@Override
	public void pedal() {
		
	}

}
