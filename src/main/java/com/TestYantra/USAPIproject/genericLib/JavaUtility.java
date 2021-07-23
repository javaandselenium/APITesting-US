package com.TestYantra.USAPIproject.genericLib;

import java.util.Random;

public class JavaUtility {
	
	public static int getRanDomNum() {
		Random ran=new Random();
		int num = ran.nextInt(20);
		return num;
	}

}
