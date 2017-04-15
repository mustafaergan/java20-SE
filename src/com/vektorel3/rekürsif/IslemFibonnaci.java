package com.vektorel3.rekürsif;

public class IslemFibonnaci {
	
	public static void main(String[] args) {
		System.out.println(fibo(10));
	}

	private static int fibo(int i) {
		if(i == 1 || i == 2 )
			return 1;
		else
			return fibo(i-1)+fibo(i-2);
	}


}
