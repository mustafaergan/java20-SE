package com.vektore2.sporarray;

public class Islem {
	
	public static void main(String[] args) {
		Spor futbol = new Spor();
		
		futbol.setTuru("futbol");
		
		Spor buzhokeyi = new Spor();
		
		buzhokeyi.setTuru("buzhokeyi");
		
//		Spor[] sporArray = new Spor[2];
//		sporArray[0] = futbol;
//		sporArray[1] = buzhokeyi;
		
		Spor[] sporArray = {futbol,buzhokeyi};

		yazdir(sporArray);

	}
	
	
	public static void yazdir(Spor[] asd){
		for (int i = 0; i < asd.length; i++) {
			Spor a = asd[i];
			System.out.println(a.getTuru());
			a.setOyuncusayi(i+11);
		}
	}

}
