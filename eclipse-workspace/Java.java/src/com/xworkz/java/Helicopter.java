package com.xworkz.java;

public class Helicopter {
	
		String name="AMAZON";
		String model="AMazon123";
		double price=123456;
		boolean working=true;
		
		
	
	public Helicopter(String name, String model, double price, boolean working) {
			super();
			this.name = name;
			this.model = model;
			this.price = price;
			this.working = working;
		}


	public Helicopter() {
		
		System.out.println("DEFAULT CONSTRUCTOR HELICOPTER");
	}
	
	
	@Override
	public int hashCode() {

		System.out.println("hashcode helicopter");
		return 555;
	}
	
	@Override
	public String toString() {
	
		System.out.println("String to string helicopter");
		return "HELICOPTER";
	}

	
	@Override
	public boolean equals(Object obj) {

		System.out.println("RUNNING OBJECT hELICOTER METHOD");
		
		if(obj==null)
		{
			System.out.println("object of helicopter is pointing to null");
		}
		else
		{
			System.out.println("Object of helicopter is not pointing to null");
		}
		
		if(obj instanceof Helicopter)
		{
			System.out.println("object is pointing tohelicopter");
			
			Helicopter helicopter=(Helicopter)obj;
			
			String sname=helicopter.name;
			String smodel=helicopter.model;
			
			if(this.name.equals(sname) && this.model.equals(smodel));
			System.out.println("both references variables which we initialsed  the helicopter are eqaul");
			return true;
			
	
		}
		else {
			System.err.println("object is not pointing to null");
			return false;
		}
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
