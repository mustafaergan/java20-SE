package com.vektore2.cevre;

public class Islem {
	
	static int a = 5;

	public static void main(String[] args) {
		
//		Lokanta lokanta = new Lokanta();
//		lokanta.birFoksiyon();
		
		Ev evMustafa = new Ev();
		Ev ev1 = new Ev();
		
		evMustafa.setKacOda(10);
		evMustafa.kacOda = 10;
		
		evMustafa.setBahceVarMý(true);
		
		evMustafa.setMetreKAre(1000.0);
		
		evMustafa.setAdres("Çankata/Ankara");
		
		System.out.println(evMustafa.getKacOda());
		System.out.println(evMustafa.getAdres());
		System.out.println(evMustafa.getMetreKAre());
		System.out.println(evMustafa.getBahceVarMý());
		
		
		Park parkGuven = new Park();
		
		parkGuven.setAgacSayisi(1000);
		parkGuven.setIsmi("Güven");
		
		Park parkGezi = new Park();
		
		parkGezi.setAgacSayisi(500);
		parkGezi.setIsmi("Gezi");
		parkGezi.setIsmi("Ovecler");
		
		System.out.println(parkGuven.getAgacSayisi());
		System.out.println(parkGuven.getIsmi());
		
		System.out.println(parkGezi.getAgacSayisi());
		System.out.println(parkGezi.getIsmi());


	}
	
	
	
}
