package com.ders20.dosya.streamyazici;

import java.io.File;

public class Islem {
	public static void main(String[] args) {
		Yazici yazici = new Yazici();
		File file = new File("c:/mustafa/stream.txt");
		String veri = "Merhaba Dunya";
		yazici.yaz(file, veri.getBytes());
	}

}
