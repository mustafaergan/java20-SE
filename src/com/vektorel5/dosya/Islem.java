package com.vektorel5.dosya;

import java.io.File;

public class Islem {
	
	public static void main(String[] args) {
		
		File file = new File("C:/kisiler/");
		
		if(file.isDirectory()){
			System.out.println(file.getPath());
			System.out.println(file.getParentFile().getPath());
		}
		File file1 = new File("C:/Users/Public/Pictures/Sample Pictures/Desert.jpg");

		if(file1.exists()){
			if(file1.isFile()){
				System.out.println(file1.getName());
			}
		}
		
		File file3 = new File("C:/kisiler/Mustafa/");

		if(!file3.exists())
			file3.mkdir();
		
		

	}
	

}
