package com.ders20.dosya;

import java.io.File;
import java.io.IOException;

public class Islem {

	public static void main(String[] args) {
		
		File file = new  File("C:/mustafa");
		
		if(file.exists()){
//			if(file.canRead())
//			if(file.canWrite())
//			file.mkdir();
			if(file.isDirectory()){
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					System.out.println(files[i].getName());
					if(files[i].getName().equals("19.txt")){
						files[i].delete();
						File file2 = 
						new File(file.getPath()
						+"/mustafa"+files[i].getName());
						try {
							file2.createNewFile();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
			
		}
		
		File file20 = new  File("C:/mustafa/20.txt");
		
		if(!file20.exists()){
			try {
				file20.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			if(file.canRead()){
				//okunabilir
			}
		}
		
		 
		
		
	}
	
}
