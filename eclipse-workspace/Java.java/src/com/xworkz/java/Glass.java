package com.xworkz.java;

public class Glass {
	
	String name="FLOWER";
	String model="FLOWER123";
	int price=356;
	boolean working=true;
	
	
	public Glass(String name, String model, int price, boolean working) {
		super();
		System.out.println("DEFAULT Glass constructor");
		this.name = name;
		this.model = model;
		this.price = price;
		this.working = working;
	}

	public Glass() {
		System.out.println("DEFAULT GLASS CONSTRUCTOR");
	}
	
	@Override
	public int hashCode() {
		System.out.println("RETURNING HASCODE IN GLASS");
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		System.out.println("RETUNING STRING TO STRING IN GLASS");
		return "STRING IN GLASS";
	}
	
	
	@Override
	public boolean equals(Object obj) {

		System.out.println("Creating an object in class");
		System.out.println("running Object method from th runner class");
		
		if(obj==null)
		{
			System.out.println("here object is not null");
		}
		else
		{
			System.err.println("Here is object is pointing to null");
		}
		if(obj instanceof Glass)
		{
			System.out.println("glass is a type of an object");
			
			Glass glass=(Glass)obj;
			
			String sname=glass.name;
			String smodel=glass.model;
			
			if(this.name.equals(sname) && this.model.equals(smodel));
			
			System.out.println("Here glass and object are same beacause of the type casting");
			
			return true;
			
			
			
		}
		else {
			System.out.println("Here glass and object are not same");
			return false;
		}
		
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
