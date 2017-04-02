package com.vektorel3.interfaces.matematik;

public class Islem {
	
	public static void main(String[] args) {
		
		IArray array = new Matematik();
		
		int[] veri = array.buSayiyaKadarUsBul(65);
		
		for (int i = 0; i < veri.length; i++) {
			if(veri[i]==0)
				break;
			System.out.println(veri[i]);
		}
		
		
		array.minBul(veri);
		
		array.cokgenCevreHesapla(veri);
		
		IDortIslem dort = new Matematik();
		
		int a = dort.carpma(10, 25);
		
		
	}

}
