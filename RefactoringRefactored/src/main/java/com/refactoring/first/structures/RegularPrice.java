package com.refactoring.first.structures;

import com.refactoring.first.Movie;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	public double getCharge(int daysRented) {
		double result = two;
		if(daysRented > two){
			result += (daysRented - two) * oneAndHalf;
		}
		return result;
	}
}
