package com.vektorel3.interfaces.dershane;

public class Islem {
	
	public static void main(String[] args) {
		
		Vektorel vektorel = new Vektorel();
		vektorel.hoca();
		vektorel.ogrenci();
		vektorel.muhasebe();
		
		IKurs kursVektorel = new Vektorel();
		kursVektorel.hoca();
		kursVektorel.ogrenci();
		
		IHoca hocaVektorel = new Vektorel();
		
		hocaVektorel.muhasebe();
		hocaVektorel.ogrenci();
	
		
		
		IHoca hoca = new IHoca() {
			
			@Override
			public void ogrenci() {
				System.out.println("claas içi hoca");
			}
			
			@Override
			public void muhasebe() {
				System.out.println("class içi muhasebe");
			}
		};
		
		hoca.ogrenci();
	}
	
	
	public static void foksiyon(){
		
	}

}
