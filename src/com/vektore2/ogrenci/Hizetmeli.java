package com.vektore2.ogrenci;

public class Hizetmeli {
	int id;
	String isim;
	
	void isimYazdir(){
		System.out.println(id+"--"+isim);
	}
	
	void idVerisiAta(int veri){
		id = veri;
	}
	
	String isimArtiVektorel(){
		String isimYeni = "Vektorel-"+isim ;
		return isimYeni;
	}

}
