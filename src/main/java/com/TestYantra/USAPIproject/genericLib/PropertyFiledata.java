package com.TestYantra.USAPIproject.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFiledata {

	
	public String getData(String key) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		return p.getProperty(key);
	}
}
