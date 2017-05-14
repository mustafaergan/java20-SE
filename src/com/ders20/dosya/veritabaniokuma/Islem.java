package com.ders20.dosya.veritabaniokuma;

import java.util.ArrayList;
import java.util.List;

import com.ders20.dosya.okuma.Okuyucu;

public class Islem {

	public static void main(String[] args) {
		Okuyucu oku = new Okuyucu();
		List<String> myList = oku.oku(oku.dosyaAl("c:/mustafa/person.txt"));

		 List<Person> personList = new ArrayList<>();

		for (String veri : myList) {
			Person person = new Person(veri.split("#"));
			personList.add(person);
		}
		
		for (Person person : personList) {
			person.selamVer();
		}

	}

}
