package com.ders25.jdbc.okul;

import java.util.List;

import com.ders25.jdbc.okul.dao.OkulDAO;
import com.ders25.jdbc.okul.entity.Ogrenci;

public class Islem {
	
	public static void main(String[] args) {
		OkulDAO dao = new OkulDAO();
		String SQl = "SELECT * FROM ogrenci";
		List<Ogrenci> ogrenciList = dao.read(SQl);
		
		for (Ogrenci ogrenci : ogrenciList) {
			System.out.println(ogrenci.getName());
		}
		
		System.out.println("--------------");
		
		SQl = "SELECT * FROM ogrenci where id = 2";
		ogrenciList = dao.read(SQl);
		for (Ogrenci ogrenci : ogrenciList) {
			System.out.println(ogrenci.getName());
		}
		
		
		System.out.println("--------------");
		
		SQl = "SELECT * FROM ogrenci where id < 10";
		ogrenciList = dao.read(SQl);
		for (Ogrenci ogrenci : ogrenciList) {
			System.out.println(ogrenci.getName());
		}
		
		//primary key sebebiyle tek bir kere calisabilir
//		System.out.println("--------------");
//		SQl = "INSERT INTO OGRENCI (ID,NAME) VALUES (3,'MEHMET')";
//		dao.insert(SQl);
//		SQl = "INSERT INTO OGRENCI (ID,NAME) VALUES (4,'AHMET')";
//		dao.insert(SQl);
//		SQl = "INSERT INTO OGRENCI (ID,NAME) VALUES (5,'HASAN')";
//		dao.insert(SQl);
		
		System.out.println("--------------");
		SQl = "DELETE FROM OGRENCI WHERE ID = 4";
		dao.delete(SQl);
		
		System.out.println("--------------");
		SQl = "UPDATE OGRENCI SET NAME= 'HASANX' WHERE ID = 5";
		dao.update(SQl);
		
		System.out.println("--------------");
		SQl = "CREATE TABLE MUDUR(ID INT,NAME VARCHAR(50))";
		dao.create(SQl);
		
		
		
		
	}

}
