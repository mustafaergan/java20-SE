package com.vektorel4.swing.layout.gridlayout;

public class Islem {
	
	public static void main(String[] args) {
		
		Login login = new Login("Login Sayfasý");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		login.setSize(100, 100);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		login.setSize(400, 400);
		
		login.benimAyarlarim();
	}
	

}
