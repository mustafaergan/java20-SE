package com.vektore2.matematik;

import java.util.Scanner;

public class Dikdortgen {

	int kisaKenar;
	int uzunKenar;
	
	
	public int alanHesapla(){
		int sonuc = this.kisaKenar  * this.uzunKenar;
		return sonuc;
	}
	
	public int cevreHesapla(){
		int sonuc = (this.kisaKenar * 2) +(this.uzunKenar*2);
		return sonuc;
	}
	
	
	public double kosegenUzunluguHesapla(){
		double sonuc = (Math.pow(this.kisaKenar, 2) + Math.pow(this.uzunKenar, 2));
		sonuc = Math.sqrt(sonuc);
		return sonuc;
	}
	
	public int alanHesaplaScanner(){
		Scanner scan = new Scanner(System.in);
		return scan.nextInt()*scan.nextInt();
	}
	
	public void setKisaKenar(int kisaKenar) {
		this.kisaKenar = kisaKenar;
	}
	
	public void setUzunKenar(int uzunKenar) {
		this.uzunKenar = uzunKenar;
	}
	
	public int getKisaKenar() {
		return kisaKenar;
	}
	
	public int getUzunKenar() {
		return uzunKenar;
	}
	
}
