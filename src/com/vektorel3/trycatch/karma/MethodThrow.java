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
	}



}
