package com.ders25.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabase {

	public static void main(String[] args) {


//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e1) {
//			System.out.println("hata");
//			e1.printStackTrace();
//		}

		String url = "jdbc:mysql://localhost:3306/okul";
		
		
		try {
			Connection con = 
		DriverManager.getConnection(url, "root", "");
			
			if(con != null)
				System.out.println("baglandi");
			
		String SQL = "SELECT ID, NAME FROM OGRENCI";
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(SQL);
		
		while(rs.next()){
			int id = rs.getInt("id");
			String name = rs.getString("name");
			System.out.println("id:"+id+" name:"+ name);
			
		}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
