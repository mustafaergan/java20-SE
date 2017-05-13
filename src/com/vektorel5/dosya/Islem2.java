package com.vektorel5.dosya;

import java.io.File;
import java.io.IOException;

public class Islem2 {

	public static void main(String[] args) {
		
		File file1 = new File("C:/mustafa");
		
		if(file1.exists()){
			File file2 = 
					new File
					(file1.getPath() +"/ergan");
			if(!file2.exists())
				file2.mkdir();
			else{
				File file3 = new File(file2.getPath()+"/a.txt");
				if(!file3.exists())
					try {
						file3.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}else{
			file1.mkdir();
		}
		
		
	}
	
}
