package com.vektorel.foksiyon;

public class Foksiyon {
	
	static void mahmut(int sayac){
		
		int sayac2 = 0;
		
		for(int i = 0;i<sayac;i++)
			System.out.println("------------------");
		
		
		sayac += 5; 
		ahmet(sayac);
		System.out.println("mahmut bitiþ yeri");
		
	}
	
	public static void main(String[] args) {
		
		int benimVerim =5; 
		
		mahmut(benimVerim);
		
		mahmut(5);
		
		System.out.println("çeþitli islemler");
		
		mahmut(3);
		 
		double deger = 6.0;
		
		ahmet(deger);
	}
	
	static void ahmet(double www){
		System.out.println("Ahmet Selam Eder");
	}
	

}
