package com.ders20.dosya.streamyazici;

import java.io.File;
import java.io.FileOutputStream;

public class Yazici {
	
	public void yaz(File file, byte[] b) {
		try{
		FileOutputStream fileOutputStream =
				new FileOutputStream(file);
		fileOutputStream.write(b);
		fileOutputStream.close();
		}catch (Exception e) {
			e.getMessage();
		}

	}

}
