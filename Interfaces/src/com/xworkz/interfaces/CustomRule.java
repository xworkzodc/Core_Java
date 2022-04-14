package com.xworkz.interfaces;

public  interface  CustomRule {
  
	public default boolean validPassport(){
	{
		System.out.println("This is a valid passport"+this.getClass().getSimpleName());
		return true;
	}
	}
	
	default boolean baggageCheckin()
	{
		System.out.println("Baggaga checkin process"+this.getClass().getSimpleName());
		return true;
		
	}
	
	
	public String bookedTickets();
	/*{
		System.out.println("Checking whether the tickets are booked");
	  
		System.out.println("This is the method from the booked tickets from the Custom rule"+this.getClass().getSimpleName());
		

         return null ;
	}*/

	
	
	
	
	
	
	
	
}
