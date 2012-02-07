package com.refactoring.first.structures;

import java.util.Properties;

import com.refactoring.first.utils.FileAccess;

public abstract class Price {

	protected static double	oneAndHalf;
	protected static int 	two;
	protected static double	three;
	
	protected Price(){
		Properties prop = FileAccess.getValue();
		oneAndHalf = Double.parseDouble(prop.getProperty("oneAndHalf"));
		two = Integer.parseInt(prop.getProperty("two"));
		three = Double.parseDouble(prop.getProperty("three"));
	}
	
	public abstract int getPriceCode();
	public abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
	
}
