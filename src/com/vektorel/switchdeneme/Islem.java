package com.vektorel.switchdeneme;

public class Islem {
	
	public static void main(String[] args) {
		int a =5;
		
//		if(a == 6){
//			System.out.println("6");
//		}else if(a == 7){
//			System.out.println("7");
//		}else if(a == 5){
//			System.out.println("5");
//		}else {
//			
//		}
		
		switch (a) {
		case 5:
				System.out.println("5"); 
				
				
		case 6:
				System.out.println("6");
				if(a == 5){
					System.out.println("deger 5 ama 6 ya girdi");
				}
				
		case 1: System.out.println("1");
		case 7:
				System.out.println("7");
				break;
				
				
		default:
				System.out.println("hiç biri olmazsa");
			
		}
		
	}

}
