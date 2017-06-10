package com.ders25.jdbc.okul.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DAO {

	public final String URL = "jdbc:mysql://localhost:3306/okul";

	public final String userName = "root";

	public final String password = "";

	public Connection createCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, userName, password);

			if (con != null)
				System.out.println("baglandi");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
