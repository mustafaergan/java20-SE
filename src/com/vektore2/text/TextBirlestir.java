package com.vektore2.text;

public class TextBirlestir {
	String[] dizisi;
	
	public TextBirlestir(String[] dizisi){
		this.dizisi = dizisi;
	}
	
	public TextBirlestir(String a, String b, String c) {
		this.dizisi = new String[3];
		this.dizisi[0] = a;
		this.dizisi[1] = b;
		this.dizisi[2] = c;
	}
	
	public TextBirlestir(String a, String b) {
		this.dizisi = new String[3];
		this.dizisi[0] = a;
		this.dizisi[1] = "-";
		this.dizisi[2] = b;
	}
	
	public String birlestir(){
//		for(int i = 0 ; i < this.dizisi.length; i++){
//			String veri = this.dizisi[i];
//		}
		String sonuc = "";
		for(String veri : this.dizisi){
			sonuc += veri;
			sonuc += " ";
		}
		return sonuc;
	}

}
