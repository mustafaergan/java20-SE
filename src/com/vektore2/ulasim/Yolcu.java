package com.vektore2.ulasim;

public class Yolcu {
	int id;
	public String name;
	
	public Yolcu(String b, int a){
		this.id = a;
		this.name = b;
	}
	
	void hangiOtobustesin(Otobus a){
		System.out.println(a.numara);
		System.out.println(a.kacTaneYolcuAlabilir());
		if(a.kacTaneYolcuAlabilir() < 20)
		{
			System.out.println("Soför bey daha adam alacakmýsýnýz");
		}
		
	}
}
