package com.vektorel.cumhuriyet;

public class Islem {
	
	public static void main(String[] args) {
		String ilk = "Yaþasýn Cumhuriyet";
		
		System.out.println("ilk:"+ilk);
		
		char[] array = ilk.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			if(i%2 == 0)
				array[i] = String.valueOf(array[i]).toUpperCase().charAt(0);
		}
		
		String son = new String(array);
		
		System.out.println("son:"+son);

	}

}
