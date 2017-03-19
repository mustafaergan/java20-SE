package com.vektore2.matematik2;

public class Topla {
	
	private int sonuc;
	
	public Topla(int a, int b){
		this.sonuc = a+b;
	}
	
	public Topla(int a, int b, int c){
		this.sonuc = a+b+c;
	}
	
	public Topla(int a, double b, int c){
		this.sonuc = a+((int)b)+c;
	}
	
	public Topla(int a, double b, String c){
//		this.sonuc = a+((int)b)+c;
	}
	
	
	public Topla(int a, int b, int c, int d){
		this.sonuc = a+b+c;
	}
	
	public Topla(int[] array1){
		this.sonuc = arrayTopla(array1);
//		for(int veri : array1){
//			this.sonuc += veri;
//		}
	}
	public Topla(int[] array1,int[] array2){
		this.sonuc = arrayTopla(array1) + arrayTopla(array2); 
//		this.sonuc = arrayTopla(array1); 
//		this.sonuc += arrayTopla(array2); 
	}
	
	private int arrayTopla(int[] array){
		int sonuc = 0;
		for(int i = 0 ; i< array.length ; i++){
			sonuc += array[i];
		}
		return sonuc;
	}
	
	public int getSonuc() {
		return sonuc;
	}
}
