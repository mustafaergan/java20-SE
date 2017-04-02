package com.vektorel.array;

public class Asal {
	
	public int asalDegerBul(int[][][][] arrayElemani) {

        int temp = 1;
        int sayac = 0;
        
//        int array[] = new int[10000];

        for (int i = 0; i < arrayElemani.length; i++) {
            for (int j = 0; j < arrayElemani[i].length; j++) {
                for (int k = 0; k < arrayElemani[i][j].length; k++) {
                    for (int l = 0; l <arrayElemani[i][j][k].length ; l++) {
                        temp = arrayElemani[i][j][k][l];
                        if(asalBul(temp)){
                        	return temp;
                        }
//                    	if(assalBul(temp)){
//                    		array[sayac] = temp;
//                    		sayac ++;
//                    	}
                    }}}}
                    	
        return temp;
	
}

	private boolean asalBul(int temp) {
		
		for (int i = 2; i < temp; i++) {
			
			if(temp %i == 0) {
				return false;
			}
			
		}
		
		return true;
	}
}
