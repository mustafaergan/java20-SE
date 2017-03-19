package com.vektore2.matematik2;

public class Cikarma {
	
	public int sonuc(){
		return 0;
	}
	
	public int sonuc(int a){
		return a;
	}
	
	/**
	 * boyle bir seyin imkani yok
	 */
//	public double sonuc(int a){
//		return a;
//	}
	
	public int sonuc(double a){
		return (int)a;
	}
	public int sonuc(int a, int b){
		System.out.println("int int");
		return a-b;
	}
	public int sonuc(double a, double b){
		System.out.println("double double");
		return (int)(a -b) ;
	}
	
	public int sonuc(int a, double b){
		System.out.println("int double");
		return (int)(a -b) ;
	}
	
	public int sonuc(double a, int b){
		System.out.println("double int");
		return (int)(a -b) ;
	}

}
