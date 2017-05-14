package com.ders20.dosya.yazici;

import java.util.ArrayList;
import java.util.List;

import com.ders20.dosya.okuma.Okuyucu;
import com.ders20.dosya.veritabaniokuma.Person;

public class Islem {

	public static void main(String[] args) {

		Okuyucu oku = new Okuyucu();

		List<String> myList = oku.oku(oku.dosyaAl("c:/mustafa/person.txt"));

		List<Person> personList = new ArrayList<>();

		for (String veri : myList) {
			Person person = new Person(veri.split("#"));
			personList.add(person);
		}

		Yazici yazici = new Yazici();
		yazici.yaz("c:/mustafa/benimdosyam.txt", personList);

	}

}
