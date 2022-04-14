package com.xworkz.interfaces;

public class CustomCheckInTimeRule implements CustomRule, CustomGoodsRule{

	double minCheckInTime()
	{
		
		System.out.println("Checking the minimuk time rule ");
		System.out.println("Calling the method from the custom checkin time rule");
		
		return 555;
		
	}

	@Override
	public boolean validPassport() {

		System.out.println("Implementing unimplemented method from the custom rule in custom check in time ()");
		
		return false;
	}

	@Override
	public String bookedTickets() {
		System.out.println("Implementing booked tickets  unimplemented method from the custom rule in custom check in time ()");

		return null;
	}

	@Override
	public String[] validItems() {

		System.out.println("Implementing method from the CustomGoodsRule");
		return null;
	}

	@Override
	public String[] nonvalidItems() {
          System.out.println("Implementing non valid items from the custom goods rule");
		return null;
	}
	

	
	
	
	
	



}
