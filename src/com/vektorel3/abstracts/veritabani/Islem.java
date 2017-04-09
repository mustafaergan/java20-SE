package com.vektorel3.abstracts.veritabani;

public class Islem {
	
	public static void main(String[] args) {
		
		AVeritabani veritabani = new AVeritabani() {
			
			@Override
			public void login() {
				System.out.println("login class içi");
				
			}
			
			@Override
			public void connection() {
				System.out.println("class içi baglanti");
				super.connection();
			}
		};
		
		veritabani.login();
		
		veritabani.connection();
		
		
	}

}
