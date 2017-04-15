package com.vektorel3.trycatch.myclass;

public class Islem {
	
	public static void main(String[] args) {
//		
//		int a = 10;
//		int b = 0;
		
		try {
			throw new MyError("0 bölünme hatasý");
		} catch (MyError e) {
			System.out.println("catch : "+e.getMessage());
			System.out.println("---------------");
			e.printStackTrace();
		}
		
		
		
	}

}
