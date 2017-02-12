package com.vektorel.evdemi;

import java.util.Scanner;

public class Islem {
	
	public static void main(String[] args) {
		boolean kontrol;
		
		String kontrolString;
		
		Scanner oku = new Scanner(System.in);
		
		kontrol = oku.nextBoolean();
		
		kontrolString = oku.nextLine();
		
		if(kontrol){
			System.out.println("Günaydýn");
		}else{
			System.out.println("Evden direk çýk");
		}
		
		
		String annenEvdeMiString;
		
		annenEvdeMiString = oku.nextLine();
		
		if(annenEvdeMiString.equals("evet")){
			System.out.println("String Evet Geldi");
		}else{
			System.out.println("String Baþka Bir deðer Geldi");
		}
		
		int paraCokomelEgrisi;
		
		paraCokomelEgrisi = oku.nextInt();
		
		if(paraCokomelEgrisi == 20){
			System.out.println("çikolata senindir");
		}else if (paraCokomelEgrisi < 20 & paraCokomelEgrisi > 0){
			System.out.println("paran yetersiz");
		}else if (paraCokomelEgrisi>20){
			System.out.println("paran çok");
		}else if (paraCokomelEgrisi == -1){
			System.out.println("paran bozuk degil yada yeterli degil");
		}
		
		
	}
	

}
