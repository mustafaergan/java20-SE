package com.vektorel3.koleksiyonlar.set.person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Islem {
	
	public static void main(String[] args) {
		
//		Person[] aa = new Person[];
		
		String veri = "vektorel";
		
		HashSet<String> myList = new HashSet<>();
		myList.add(veri);
		
		Set<String> myListInterface = new HashSet<>();
		
		Set<Person> personList = new LinkedHashSet<>(); 
		
		Person person = new Person(1,"mustafa","vektorel");
		Person person2 = new Person(1,"ergan","vektorel");

		personList.add(person);
		personList.add(person2);
		
		Iterator<Person> it = personList.iterator();
		
		while(it.hasNext()){
			Person personnn = it.next();
			System.out.println(personnn.getAdi());
		}
		Scanner scan = new Scanner(System.in);
		
		int veriint = scan.nextInt();
		
			while(veriint != 0){
				createPerson(veriint,scan.next(),scan.next());
				veriint = scan.nextInt();
			}
		
		
	}
	
	static Person createPerson(int id,String name,String soyad){
		Person person = new Person(id,name,soyad);
		return person;
	}
	
	

}
