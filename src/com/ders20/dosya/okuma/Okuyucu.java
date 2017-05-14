package com.ders20.dosya.okuma;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Okuyucu {
	
	public File dosyaAl(String path) {
		File file = new File(path);
		if(file.exists())
			if(file.isFile())
				return file;
		return null;
	}
	
	public List<String> oku(File file) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		String[] myArray = new String[5];
//		int sayac = 0;
//		while(scanner.hasNextLine()){
//			sayac ++;
//			System.out.println(scanner.nextLine());
//			myArray[sayac] = scanner.nextLine());
//		}
		List<String> myList = new ArrayList<>();
		while(scanner.hasNextLine()){
//			System.out.println(scanner.nextLine());
			myList.add(scanner.nextLine());
		}
		return myList;
	}

}
