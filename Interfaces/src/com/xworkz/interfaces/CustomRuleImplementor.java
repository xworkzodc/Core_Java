package com.xworkz.interfaces;

public class CustomRuleImplementor extends Object implements CustomRule  {

	@Override
	public String bookedTickets() {

		System.out.println("Implementing the methods from the CustomCheckInTimeRule  class");
		
		return null;
	}

	public CustomRuleImplementor() {

	System.out.println("Default constructor of the customRule Implementer");
	}

	@Override
	public boolean validPassport() {

		
		System.out.println("implementing  validPassport method from the other class  ");
		return true;
	}

	
	
	
	
}
