package com.TestYantra.USAP1Project.scripts;


import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.TestYantra.USAPIproject.genericLib.PropertyFiledata;

import static io.restassured.RestAssured.*;



public class BaseClass {
	public PropertyFiledata fileutilies=new PropertyFiledata();
	
	
	@BeforeMethod
	public void openApp() {
		baseURI="https://api.github.com";
	}

	
	@AfterMethod
	public void closeApp() {
		Reporter.log("we are closeing");
	}

}
