package com.vektorel3.rekürsif;

public class IslemFak {
	
	public static void main(String[] args) {
		System.out.println(foktoriyel(5));
	}

	private static int foktoriyel(int i) {
		System.out.println("buradayim : " + i );
		if(i == 1){
			System.out.println("buradayim i = 1' iken : " + i );
			return 1;
		}else{
			return i* foktoriyel(i-1);
		}
	}

}
