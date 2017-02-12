package com.vektorel.dosya;

import java.io.File;

public class Islem {
	public static void main(String[] args) {
		File file = new File("C:/Mustafa/deneme1.txt");
		
		File filedongu = null;
		
		if(file.isFile()){
			file.delete();
		}
	}

}
