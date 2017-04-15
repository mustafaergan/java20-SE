package com.vektorel3.trycatch.mustafahatasi;

import java.util.Calendar;

public class Islem {
	
	public static void main(String[] args) {
		Kisi kisi = new Kisi();
		
		try{
			if(kisi.getVeri() == null){
				throw new MustafaHatasi("null bura kardas", 
						(int)Calendar.getInstance().getWeeksInWeekYear());
			}
		}catch (MustafaHatasi e) {
			System.out.println(e.getMessage());
			System.out.println(e.getTime());
		}
		
		System.out.println("------------");
		
	  Calendar cal = Calendar.getInstance();
	  System.out.println(cal.get(Calendar.MONTH)+1);
	  System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	  System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
		
	}

}
