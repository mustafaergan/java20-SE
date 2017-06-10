package com.ders25.jdbc.okul;

import java.util.List;

import com.ders25.jdbc.okul.dao.OkulDAO;
import com.ders25.jdbc.okul.entity.Ogrenci;

public class Islem {
	
	public static void main(String[] args) {
		OkulDAO dao = new OkulDAO();
		String SQl = "SELECT * FROM OGRENCI";
		List<Ogrenci> ogrenciList = dao.read(SQl);
		
		for (Ogrenci ogrenci : ogrenciList) {
			System.out.println(ogrenci.getName());
		}
		
		
	}

}
