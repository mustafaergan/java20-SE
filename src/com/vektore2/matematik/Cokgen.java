package com.vektore2.matematik;

public class Cokgen {

	int[] kenar;
	
	public Cokgen(){
		System.out.println("Merhaba Ben Cokgen");
		
		this.kenar = new int[5];
	}
	
	public Cokgen(int[] kenar){
		System.out.println("Merhaba Ben Cokgen Dizi");
		
		this.kenar = kenar;
	}

	public Cokgen(int a, int b, int c, int d) {
		System.out.println("MErhaba Ben dortgen");
		this.kenar = new int[4];

		this.kenar[0] = a;
		this.kenar[1] = b;
		this.kenar[2] = c;
		this.kenar[3] = d;
	}
	
	public Cokgen(int a, int b, int c, int d, int e) {
		System.out.println("MErhaba Ben Besgen");
		this.kenar = new int[5];

		this.kenar[0] = a;
		this.kenar[1] = b;
		this.kenar[2] = c;
		this.kenar[3] = d;
		this.kenar[4] = e;
	}
	
	public int cevreHesapla(){
		int sonuc = 0;
		for(int i = 0 ; i < this.kenar.length ; i++){
			sonuc += this.kenar[i];
		}
		return sonuc;
	}
	

}
