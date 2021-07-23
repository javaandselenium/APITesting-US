package com.TestYantra.USAPIproject.genericLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtilies {
	public Driver driverref;
	public Connection con;
	public ResultSet state;
	public ResultSet result;
	
	
	public void connectToDB() throws SQLException {
		driverref=new Driver();
		DriverManager.registerDriver(driverref);
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/api107","root","root");
		
	}
	
	
	public ResultSet executeQuery(String query) throws SQLException {
		 return state = con.createStatement().executeQuery(query);
		
	}
	
	public void executeTheQueryAndGetData(String query,int columnname,String exceptedadata) throws SQLException {
		 result = con.createStatement().executeQuery(query);
		 while(result.next()) {
			 if(result.getString(columnname).equals(exceptedadata)) {
				 break;
			 }
			 else
			 {
				 System.out.println("data not found");
			 }
		 }}
		 
		 public void closedb() throws SQLException {
			 con.close();
		 }
	}
	


