package com.etud.cons.geo;

public class Islem {
	
	public static void main(String[] args) {
		Ucgen esKenarUcgen = new Ucgen(5);
		int veri = esKenarUcgen.cevreHesapla();
		System.out.println(veri);
		
		Ucgen ikizKenarUcgen = new Ucgen(5,10);
		veri = ikizKenarUcgen.cevreHesapla();
		System.out.println(veri);
		
		Ucgen cesitKenarUcgen = new Ucgen(5,10,7);
		veri = cesitKenarUcgen.cevreHesapla();
		System.out.println(veri);
	}

}
