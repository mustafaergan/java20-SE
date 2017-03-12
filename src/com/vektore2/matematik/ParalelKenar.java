package com.vektore2.matematik;

public class ParalelKenar {
	int yanKenar;
	int yatayKenar;
	int yukseklik;
	
//	public ParalelKenar(){
//		System.out.println("Ben Parelel Kenar");
//	}
	
	public ParalelKenar(int kenar,int yukseklik){
		this.yanKenar = kenar;
		this.yatayKenar = kenar;
		this.yukseklik = yukseklik;
	}
	
	public ParalelKenar(int yanKenar, int yatayKenar,int yukseklik){
		this.yanKenar = yanKenar;
		this.yatayKenar = yatayKenar;
		this.yukseklik = yukseklik;
	}
	
	public int alanHesapla(){
		return this.yatayKenar*this.yukseklik;
	}
	

}
