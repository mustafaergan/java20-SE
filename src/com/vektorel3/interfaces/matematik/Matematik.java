package com.vektorel3.interfaces.matematik;

public class Matematik implements IArray, IDortIslem {

	@Override
	public int toplama(int a, int b) {
		return a+b;
	}

	@Override
	public int carpma(int a, int b) {
		return a*b;
	}

	@Override
	public int[] buSayiyaKadarUsBul(int veri) {

		int[] us = new int[veri];
		int ust = 0;
		
		for (int i = 1; i < veri; i++) {
			ust = (int) Math.pow(i,2);
			if(ust > veri)
				break;
			
			us[i-1] = i;
		}
		
		
		return us;
	}

	@Override
	public int minBul(int[] array) {
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if(min<array[i])
				min = array[i];
		}
		
		return min;
	}

	@Override
	public int cokgenCevreHesapla(int[] array) {
		int toplam = 0;
		for (int i = 0; i < array.length; i++) {
			toplam += array[i];
		}
		return toplam;
	}

}
