package com.vektore2.matematik2;

public class Islem {
	
	public static void main(String[] args) {
		int a = 5;
		
		int[] array1 = {1,2,3};
		
		int[] array2 = new int[2];
		array2[0] = 5;
		array2[1] = 10;
		
		int[] array3 = getArray(); 
		
		
		Topla ikiParametreli = new Topla(a, 5);
		
		Topla ucParametreli = new Topla(a, (double)6, a);

		Topla birArrayParametreli = new Topla(array1);
		
		Topla ikiArrayParametreli = new Topla(array2,array3);
		
		System.out.println(ikiParametreli.getSonuc());
		System.out.println(ucParametreli.getSonuc());
		System.out.println(birArrayParametreli.getSonuc());
		System.out.println(ikiArrayParametreli.getSonuc());


		
	}

	private static int[] getArray() {
		int[] myArray = {1,1};
		return myArray;
	}

}
