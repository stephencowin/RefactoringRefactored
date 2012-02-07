package com.refactoring.first;

import com.refactoring.first.structures.ChildrensPrice;
import com.refactoring.first.structures.NewReleasesPrice;
import com.refactoring.first.structures.Price;
import com.refactoring.first.structures.RegularPrice;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	
	private String title;
	private Price price;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return price.getPriceCode();
	}

	public final void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasesPrice();
			break;			
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}