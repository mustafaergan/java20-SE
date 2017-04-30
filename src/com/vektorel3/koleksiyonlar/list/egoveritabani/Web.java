package com.vektorel3.koleksiyonlar.list.egoveritabani;

import java.util.List;

public class Web {
	
	public static void main(String[] args) {
		ListDoldur listDoldur = new ListDoldur();
		List<Ego> myList = listDoldur.egoDoldur();
		
		for (Ego ego : myList) {
			System.out.println(ego.getTur());
		}
	}

}
