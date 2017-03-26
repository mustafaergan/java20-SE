package com.vektorel3.kalitim.ulasim;

public class Yol {
	
	private int seritSayi;
	private String tipi;
	private String ismi;
	private int hizSiniri = 80;

	
	public void hizSinir(){
		System.out.println("Hizsinir 80");
	}
	
	public int yolHesapla(int[] array) {
		int sonuc = 0;
		
		for (int i = 0; i < array.length; i++) {
			sonuc += array[i];
		}
		
		return sonuc;
	}
	
	public int sureHesap(int toplamYol) {
		return toplamYol/hizSiniri;
	}
	
	public int getSeritSayi() {
		return seritSayi;
	}
	public void setSeritSayi(int seritSayi) {
		this.seritSayi = seritSayi;
	}
	public String getTipi() {
		return tipi;
	}
	public void setTipi(String tipi) {
		this.tipi = tipi;
	}
	public String getIsmi() {
		return ismi;
	}
	public void setIsmi(String ismi) {
		this.ismi = ismi;
	}
	
	public int getHizSiniri() {
		return hizSiniri;
	}
	
	public void setHizSiniri(int hizSiniri) {
		this.hizSiniri = hizSiniri;
	}
	

}
