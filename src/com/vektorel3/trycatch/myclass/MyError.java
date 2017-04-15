package com.vektorel3.trycatch.myclass;

public class MyError extends Exception {
	
	public MyError(String message) {
		super(message);
		System.out.println(" My ERROR : loglama");
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("kendime özgü iþlemler");
		super.printStackTrace();
	}

}
