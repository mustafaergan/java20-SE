package com.vektore2.erisim;

public class Ogrenci {
	public int id;
	private String name;
	String ogrenciNo;
	
	private String sifre= "12345";
	
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	public Ogrenci(){
		bobrek();
	}
	
	public void deneme(){
		System.out.println("dene");
	}
	
	public void konusma(){
		System.out.println("konus");
		bobrek();
	}
	private void bobrek(){
		konusma();
		System.out.println("üre yap");
	}
	
	void dersDinleme(){
		
	}
	
}
