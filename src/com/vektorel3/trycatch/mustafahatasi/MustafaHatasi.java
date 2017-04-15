package com.vektorel3.trycatch.mustafahatasi;

public class MustafaHatasi extends NullPointerException {
	
	String mes;
	int time;
	
	public MustafaHatasi(String mes,int time) {
		super(mes);
		this.mes = mes;
		this.time = time;
		System.out.println("time cons:" + time);
	}
	
	public String getMes() {
		return mes;
	}
	
	public int getTime() {
		return time;
	}

}
