package com.vektorel3.trycatch.nullPon;

public class Islem {
	
	public static void main(String[] args) {
		
		Kisi kisi = new Kisi();
		
		System.out.println(kisi.getId());
		
//		kisi.setName("VEKTOREL");
		
		String name = kisi.getName();
		
		kisi.setPassword("deneme123");
		
		try{
			System.out.println(name.toLowerCase());
			kisi.login();
		}catch (Exception mustafa) {
			System.out.println();
			mustafa.printStackTrace();
		}finally {
			kisi.setPassword("****");
		}
		
		System.out.println(kisi.getPassword());
		
		System.out.println("hayatima devam edemiyorum bununla idare edemem anne");
	}

}
