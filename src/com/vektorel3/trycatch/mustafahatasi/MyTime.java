package com.vektorel3.trycatch.mustafahatasi;

import java.util.Calendar;

public class MyTime {
	
	public static void main(String[] args) {
		  Calendar cal = Calendar.getInstance();
		  System.out.println(cal.get(Calendar.MONTH)+1);
		  System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		  System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
