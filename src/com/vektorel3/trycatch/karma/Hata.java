package com.vektorel3.trycatch.karma;

import java.nio.file.FileAlreadyExistsException;

public class Hata {
	
	
	public void parseError(String veri) throws FileAlreadyExistsException{
		Integer.parseInt(veri);
	}
	
	public void deneme() throws FileAlreadyExistsException, NumberFormatException{
		parseError("asd");
	}

}
