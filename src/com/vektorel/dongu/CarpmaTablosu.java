package com.vektorel.dongu;

public class CarpmaTablosu {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10; i++){
			for(int j = 1 ; j <= 10 ; j++){
				for(int z = 1 ; z<= 10 ; z++){
					System.out.println(i+"*"+j+"*"+z +" = " +(i*j*z));
					int sayac  = 0;
					while(sayac <2){
						System.out.println("---------------------------");
						sayac ++;
					}
				}
			}
		}
		
	}

}
