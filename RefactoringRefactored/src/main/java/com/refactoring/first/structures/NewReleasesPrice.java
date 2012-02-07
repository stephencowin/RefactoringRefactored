package com.refactoring.first.structures;

import com.refactoring.first.Movie;

public class NewReleasesPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	public double getCharge(int daysRented) {
		return daysRented * three;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? two: 1;
	}
}
