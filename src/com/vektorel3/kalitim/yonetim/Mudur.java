package com.vektorel3.kalitim.yonetim;

public class Mudur extends Eleman {
	
	public void elemanAl(){
		
	}
	
	public void satinAlma(){
		System.out.println("100 000 tl satin al");
	}
	
	@Override
	public void calis() {
		System.out.println("mudur calis");
		super.calis();
	}
	
	@Override
	int alVer(int veri) {
		return veri+1;
	}
	
	public void deneme(){
		maasAl();
	}


}
