package com.vektorel.ifelse;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  mustafaninSecimi;
		
		Scanner oku = new Scanner(System.in);
		
		mustafaninSecimi= oku.nextLine(); 
		
		if(mustafaninSecimi.equals("siyah")){
			System.out.println("Siyah Giyecek");
		}else{
			System.out.println("Gri Giyecek");

		}
		

	}

}
