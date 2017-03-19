package com.vektore2.spor;

public class Spor {
	
	public void sporBilgiVer(Buzhokeyi buzhokeyi){
		
		System.out.println("---------");
		
		System.out.println(buzhokeyi.getHakemSayisi() + "--" + buzhokeyi.getOyuncuSayisi());
		
		System.out.println("---------");
	}
	
	public void sporBilgiVer(Futbol futbol){
		
		System.out.println("---------");
		
		System.out.println(futbol.getHakemSayisi() + "--" + futbol.getOyuncuSayisi());

		
		System.out.println("---------");
	}

}
