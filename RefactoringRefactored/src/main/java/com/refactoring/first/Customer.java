package com.refactoring.first;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> customerRentals = new ArrayList<Rental>();
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void addRental(Rental arg) {
		this.customerRentals.add(arg);
	}
	
	public String getName() {
		return name;
	}
	
	public String statement() {

		String result = "Rental Record for " + getName() + "\n";
		
		for (Rental rental :customerRentals) {
			result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
		}
		// add footer lines
		result += "Amount owed is " + getTotalCharge() + "\n";
		result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
		
		return result;
	}
	
	public String htmlStatement() {

		String result = "<H1>Rental Record for <EM>" + getName() + "</EM></H1><P>";
		for (Rental rental :customerRentals) {
			result += rental.getMovie().getTitle() + " " + rental.getCharge() + " <BR>";
		}
		// add footer lines
		result += "<P>You owe " + getTotalCharge() + " on this rental<BR> you earned <EM>";
		result += getTotalFrequentRenterPoints() + "</EM> frequent renter points";
		return result;
	}	

	public double getTotalCharge(){
		double result = 0;
		for (Rental rental :customerRentals) {
			result += rental.getCharge();
		}
		return result;
	}
	
	public int getTotalFrequentRenterPoints(){
		int result = 0;
		for (Rental rental :customerRentals) {
			result+= rental.getFrequentRenterPoints();
		}
		return result;		
	}	

}
