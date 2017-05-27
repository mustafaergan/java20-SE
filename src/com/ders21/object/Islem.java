package com.ders21.object;

import java.util.ArrayList;

public class Islem {
	
	public static void main(String[] args) {
		Object obj = new Person();
		Object obj2 = new ArrayList<>();
		Object obj3 = new String("Merhaba");
		gonder(obj);
	}

	private static void gonder(Object obj) {
		Person person = (Person) obj;
		System.out.println(person.i);
	}

}
