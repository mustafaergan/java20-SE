package com.vektorel.foksiyon;

public class HesapMakinesi {
	
	public static void main(String[] args) {
		
//		int aa =5,bb=3,cc=6;
		
		String veri = "-";
		int ff = 5;
		int mhk = 5;
		
		makina("+",ff,2);
		makina("-",8,3);
		makina(veri,10,mhk);
		
		makina("Vektorel",10,mhk);
		
		{
			{
				{
					
				}
			}
		}

		
	}
	
	public static void makina(String veri,int a,int b){
		int sonuc = 0;
		switch (veri) {
		case "+":
			sonuc = a+b;
			break;
		case "-":
			sonuc = a-b;
			break;
		}
		
		System.out.println(sonuc);
	}
	

}
