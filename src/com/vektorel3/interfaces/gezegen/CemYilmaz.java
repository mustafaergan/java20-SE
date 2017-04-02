package com.vektorel3.interfaces.gezegen;

public class CemYilmaz {
	
	public static void main(String[] args) {
		Doga doga = new Doga() {
			
			@Override
			public void toprak() {
				System.out.println("cem yilmaz toprak");
				
			}
			
			@Override
			public void tahta() {
				System.out.println("cem yilmaz tahta");
			}
			
			@Override
			public void su() {
				System.out.println("cem yilmaz su");
			}
			
			@Override
			public void ates() {
				System.out.println("cem yilmaz ates");
			}
		};
		
		doga.ates();
	}
	
	public void deneme(){
		
		Doga doga = new Doga() {
			
			@Override
			public void toprak() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void tahta() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void su() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void ates() {
				// TODO Auto-generated method stub
				
			}
		};
	
	}
	

}
