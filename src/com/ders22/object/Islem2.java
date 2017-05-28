package com.ders22.object;

public class Islem2 {

	public static void main(String[] args) {
		Object otobus = new Otobus();
		Object minubus = new Minubus();
		
		Object aa = new String("ver");

//		yolcuSayisiSoyle(otobus);
//		yolcuSayisiSoyle(minubus);
		
		yolcuSayisiSoyle(otobus,true);
		yolcuSayisiSoyle(minubus,true);
		yolcuSayisiSoyle(aa,true);


	}

	private static void yolcuSayisiSoyle(Object obj) {

		if (obj instanceof Otobus) {
			Otobus oto = (Otobus) obj;
			System.out.println(oto.getVeri());
		}
		
		if (obj instanceof Minubus) {
			Minubus oto = (Minubus) obj;
			System.out.println(oto.getVeri());
		}

	}
	
	private static void yolcuSayisiSoyle(Object obj, boolean control) {
		int veri = obj instanceof Minubus 
				? ((Minubus)obj).getVeri() 
						: ((Otobus)obj).getVeri();
		System.out.println(veri);
	}
}
