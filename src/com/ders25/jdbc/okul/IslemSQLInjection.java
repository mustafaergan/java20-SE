package com.ders25.jdbc.okul;

import java.util.List;
import java.util.Scanner;

import com.ders25.jdbc.okul.dao.OkulDAO;
import com.ders25.jdbc.okul.entity.Ogrenci;

public class IslemSQLInjection {
	
	public static void main(String[] args) {
		OkulDAO dao = new OkulDAO();
		
		
		Scanner scan = new Scanner(System.in);
		
		String SQL = "SELECT * FROM OGRENCI WHERE ID = ? ";
		
		String veri = scan.next();
		
		int id = Integer.parseInt(veri);
		
		List<Ogrenci> list = dao.readPre(SQL,id);
		
		for (Ogrenci ogrenci : list) {
			System.out.println(ogrenci.getName());
		}
		
	}

}
