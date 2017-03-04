package com.vektorel.array;


public class IkiBoyutluArray {
	
	public static void main(String[] args) {
		
		int[] tekBoyutlu = new int[10];
		
		tekBoyutlu[0] = 10;
		
		tekBoyutlu[1] = 20;
		
		tekBoyutlu[5] = 30;
		
		
		int[][] ikiBoyutlu = new int[5][3];
		
		
//		ikiBoyutlu[0][0] = 1;
//		ikiBoyutlu[1][0] = 2;
//		ikiBoyutlu[2][0] = 3;
//		
//		ikiBoyutlu[0][1] = 1*2;
//		ikiBoyutlu[1][1] = 2*2;
//		ikiBoyutlu[2][1] = 3*2;
		
//		ikiBoyutlu[0][0] = 1;
//		ikiBoyutlu[0][1] = 1;
//		ikiBoyutlu[0][2] = 1;
//		ikiBoyutlu[0][3] = 1;
//		ikiBoyutlu[0][4] = 1;
		
		int[][] ikiBoyutluFor = new int[5][3];

		
		for(int i = 0 ; i < 5; i++){
			
			for(int j = 0; j < 3 ; j++){
				ikiBoyutluFor[i][j] = (i+1)*(j+1);
			}
			
		}
		
		
		String[][] myArray = stringDiziOlustur();
		
		stringDiziOku(myArray);
		
	}

	public static String[][] stringDiziOlustur() {
		String[][] myArray = new String[2][2];
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		for(int i = 0; i< myArray.length ; i++){
			for(int j = 0 ; j< myArray[i].length; j++){
				myArray[i][j] = scanner.nextLine();
			}
		}
		return myArray;
		
	}
	
	public static void stringDiziOku(String[][] dizi){
		
		for(int i = 0; i< 2 ; i++){
			for(int j = 0 ; j< 2; j++){
				System.out.println(dizi[i][j]);
			}
		}
		
	}

}
