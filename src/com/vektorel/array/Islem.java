package com.vektorel.array;

public class Islem {
	
	public static void main(String[] args) {
		
		int[][][][] array =
			{{{{12},{25}},{{36},{75},{25}}},
					{{{12}},{{10,18},{22,33,45}},
				{{45,65},{12},{17}}},{{{18},{22},{33},{88,99}}}};
		
		Asal asal = new Asal();
		
		int veri = asal.asalDegerBul(array);
		
		System.out.println(veri);
		
	}

}
