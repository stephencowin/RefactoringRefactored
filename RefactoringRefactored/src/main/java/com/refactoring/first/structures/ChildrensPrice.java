package com.refactoring.first.structures;

import com.refactoring.first.Movie;

public class ChildrensPrice extends Price {

	@Override
	public int getPriceCode(){
		return Movie.CHILDRENS;
	}
	
	public double getCharge(int daysRented) {
		double result = oneAndHalf;
		if(daysRented > three){
			result += (daysRented - three) * oneAndHalf;
		}
		return result;
	}
}