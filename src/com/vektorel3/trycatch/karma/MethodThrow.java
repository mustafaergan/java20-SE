package com.vektorel3.trycatch.karma;

import java.nio.file.FileAlreadyExistsException;

public class MethodThrow {
	
	public static void main(String[] args) {
		Hata hata = new Hata();
		try {
			hata.parseError("asd");
		} catch (FileAlreadyExistsException e) {
			e.printStackTrace();
		}
		
		try {
			hata.deneme2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
