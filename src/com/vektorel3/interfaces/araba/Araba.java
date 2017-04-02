package com.vektorel3.interfaces.araba;

public class Araba implements IAraba{

	int frenEssikDegeri = 500;
	
	@Override
	public void gaz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fren() {
		if(frenEssikDegeri > 1000){
			abs();
		}
		
	}

	@Override
	public void debriyaj() {
		// TODO Auto-generated method stub
		
	}
	
	
	private void abs(){
		
	}

}
