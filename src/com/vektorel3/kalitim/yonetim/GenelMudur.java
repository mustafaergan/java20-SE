package com.vektorel3.kalitim.yonetim;

public class GenelMudur extends Mudur {
	
	public void istenCikarma(){
		
	}
	
	@Override
	public void satinAlma() {
		System.out.println("1 000 000 tl satin alma");
	}
	
	
	public void sirketZararEdiyor(){
		super.calis();
		int a = super.veriDon();
		int b = super.alVer(11);
	}

}
