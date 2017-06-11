package com.ders25.jdbc.okul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ders25.jdbc.okul.entity.Ogrenci;

public class OkulDAO extends DAO {
	
	public List<Ogrenci> read(String SQL) {
		List<Ogrenci> ogreciList = new ArrayList<>();
		Connection con =  createCon();
		Statement statement = null;
		try {
			statement = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs =  statement.executeQuery(SQL);
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Ogrenci ogrenci = new Ogrenci(id, name);
				ogreciList.add(ogrenci);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return ogreciList;
	}
	
	public void insert(String SQL){
		exacute(SQL);
	}
	
	public void update(String SQL) {
		exacute(SQL);
	}
	
	public void delete(String SQL) {
		exacute(SQL);
	}

	public void create(String SQL) {
		exacute(SQL);
	}
	
	private boolean exacute(String SQL){
		Connection con =  createCon();
		Statement statement = null;
		boolean control = false;
		try {
			statement = con.createStatement();
			control = statement.execute(SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return control;
	}

	public List<Ogrenci> readPre(String sQL, int id) {
		List<Ogrenci> ogreciList = new ArrayList<>();
		Connection con =  createCon();
		PreparedStatement statement = null;
		try {
			statement = con.prepareStatement(sQL);
			statement.setInt(1, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs =  statement.executeQuery();
			while(rs.next()){
				int idx = rs.getInt("id");
				String name = rs.getString("name");
				Ogrenci ogrenci = new Ogrenci(idx, name);
				ogreciList.add(ogrenci);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return ogreciList;
	}

}
