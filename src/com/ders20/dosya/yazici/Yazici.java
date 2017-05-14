package com.ders20.dosya.yazici;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.ders20.dosya.veritabaniokuma.Person;

public class Yazici {
	
	public void yaz(String path, String veri) {
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		printWriter.println(veri);
		printWriter.close();
	}

	public void yaz(File file) {
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void yaz(String path, List<Person> personList) {
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (Person person : personList) {
//			printWriter.println(person.getIsim()+"-"
//					+person.getSoyad());
			printWriter.println(person.toString());
		}
		printWriter.close();		
	}
}
