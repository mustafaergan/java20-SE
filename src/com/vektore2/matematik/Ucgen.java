package com.vektore2.matematik;

public class Ucgen {

	int birinciKenar = 5;
	int ikinciKenar;
	int ucuncuKenar;
	
	int[] kenar;
	
	public Ucgen(int birinciKenar, int ikinciKenar, final int x){
		kenar = new int[3];
		kenar[0] = 10;
		kenar[1] = 5;
		kenar[2] = 15;
		System.out.println("Merhaba Ben Ucgen");
		this.birinciKenar = birinciKenar;
		this.ikinciKenar = ikinciKenar;
		this.ucuncuKenar = x;
	}
	
	public Ucgen(int birinciKenar){
		kenar = new int[1];
		kenar[0] = 10;
		System.out.println("Merhaba Ben eşkenar");
		this.birinciKenar = birinciKenar;
		this.ikinciKenar = birinciKenar;
		this.ucuncuKenar = birinciKenar;
	}
	
	public Ucgen(int birinciKenar,int ikinciKenar){
		kenar = new int[2];
		kenar[0] = 10;
		kenar[1] = 15;
		System.out.println("Merhaba Ben ikizKenar");
		this.birinciKenar = birinciKenar;
		this.ikinciKenar = birinciKenar;
		this.ucuncuKenar = ikinciKenar;
	}
	
	
	public int alanHesapla(){
		int sonuc = this.birinciKenar*this.ikinciKenar * ucuncuKenar;
		return sonuc;
	}
	
	public void ikiKenarCarpimi(){
		System.out.println(this.birinciKenar*this.ikinciKenar);
	}
	
	public int birinciKenariVer(){
		return birinciKenar;
	}
	
//	public void Ucgen(){
//		System.out.println("Merhaba Ben Ucgen");
//	}
	
	
}
