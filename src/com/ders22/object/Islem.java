package com.ders22.object;

import java.util.Scanner;

public class Islem {

	public static void main(String[] args) {
		Object intVeri = new Integer(5);
		Object stringVeri = new String("Merhaba");
		Object scanVeri = new Scanner(System.in);
		gonder(intVeri);
		gonder(stringVeri);
		gonder(scanVeri);
	}

	private static void gonder(Object obj) {
//		String veri = 5==5?"a":"b";
		if (obj instanceof Integer) {
			Integer veri = (Integer) obj;
			System.out.println(veri);
		}
		if (obj instanceof String) {
			System.out.println(((String) obj));
		}
		if (obj instanceof Scanner) {
			System.out.println(((Scanner) obj).getClass());
		}

	}
}
