package com.xworkz.java;

public class Gun {
	
	String name="VIGNESH GUN";
	String model="AK 140";
	double price=130000;
	boolean working=true;
	
	

	public Gun(String name, String model, double price, boolean working) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.working = working;
	}

	public Gun() {

		
		System.out.println("DEFAULT GUN CONSTRUCTOR");
	}
	
	@Override
	public int hashCode() {
		System.out.println("retun hashcode of the GUN");
		return 111;
	}
	
	@Override
	public String toString() {
		System.out.println("STRING TO STRING GUN");
		return "GUN STRING TO STRING";
	}
	
	@Override
	public boolean equals(Object obj) {

		System.out.println("RUNNING BOOLEAN EQUALS METHOD");
		System.out.println("running boolean objects of the gun");
		
		if(obj==null)
		{
			System.out.println("object is equal to nulll");
		}
		else {
			System.err.println("Object is not pointing to null it has an object called Gun");
		}
		
		if(obj instanceof Gun)
		{
			System.out.println("object is pointing towards gun");
			
			Gun gun=(Gun)obj;
			String sname=gun.name;
			String smodel=gun.model;
			
			if(this.name.equals(sname)  && this.model.equals(smodel));
			System.out.println("Both object of the gun are eqaul ");
			return true;
			
			
			
		}
		else
		{
			
		System.err.println("Both are not pointing ");
		return false;
			
		}
		
			
		
	
	}
	
	 

}
