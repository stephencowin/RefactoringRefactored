package com.refactoring.first.utils;

import java.util.Properties;

public class FileAccess {
	
	protected FileAccess(){}
	
	public static Properties getValue() {
	    Properties prop = new Properties();
	    
	    prop.put("oneAndHalf", "1.5");
	    prop.put("two", "2");
	    prop.put("three", "3.0");
		
		return prop;
	}
}