package com.TestYantra.USAPIproject.genericLib;

import java.sql.SQLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseClass implements IEndPoints{
//public DataBaseUtilies dbLib=new DataBaseUtilies();
public PropertyFiledata fileutilies=new PropertyFiledata();

	@BeforeMethod
	public void configBS() throws SQLException {
		//dbLib.connectToDB();
	 String baseURI = "https://api.github.com";
	}
	
	@AfterMethod
	public void configAS() throws SQLException {
		//dbLib.closedb();
	}

}
