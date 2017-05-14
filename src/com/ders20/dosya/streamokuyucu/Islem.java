package com.ders20.dosya.streamokuyucu;

import java.io.File;

public class Islem {
	
	public static void main(String[] args) {
		File file = new File("c:/mustafa/kisiler.docx");
		Okuyucu oku = new Okuyucu();
		oku.oku(file);
	}

}
