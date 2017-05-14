package com.ders20.dosya.streamokuyucu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Okuyucu {
	
	public void oku(File file) {
		
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		byte[] b = new byte[(int) file.length()]; 
		
		try {
			stream.read(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String s = new String(b);
		System.out.println(s);

	}

}
