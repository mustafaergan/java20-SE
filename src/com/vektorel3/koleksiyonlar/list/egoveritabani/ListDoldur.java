package com.vektorel3.koleksiyonlar.list.egoveritabani;

import java.util.ArrayList;
import java.util.List;

public class ListDoldur {
	
	public ListDoldur() {
		//veritabaný baglantilari yapýlýyor
	}
	
	public List<Ego> egoDoldur(){
		//veritabaný baglan ve egolarý çek
		Ego o1 = new Ego(1, "06ASD", "MAN");
		Ego o2 = new Ego(2, "06ASDx", "Temsa");

		List<Ego> ego = new ArrayList<>();
		//for 
		ego.add(o1);
		ego.add(o2);
		
		return ego;
	} 

}
