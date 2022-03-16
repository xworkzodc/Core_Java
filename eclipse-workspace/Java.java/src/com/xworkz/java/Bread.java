package com.xworkz.java;

public class Bread {
	
	String name="XWORKZ";
	String model="XWORKZ 2022";
	int price=20;
	boolean taste=false;
	
	
	public Bread(String name, String model, int price, boolean taste) {
		super();
		System.out.println("PARAMETERISED XWORKZ BREAD CONSTRUCTOR");
		this.name = name;
		this.model = model;
		this.price = price;
		this.taste = taste;
	}

	public Bread() {
		
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	
		
	@Override
	public boolean equals(Object obj) {
		
		if(obj==null) {
			System.out.println("We cannot acess bread beacause object pointing to null");
		}
		else {
			System.out.println("We can acess bread which is pointing to null");
		}
		
		if(obj instanceof Bread)
		{
			
			System.out.println("Here bread is object its an instance of class");
			
			Bread bread=(Bread)obj;
			
			String cname=bread.name;
			String cmodel=bread.model;
			
			if(this.name.equals(cname) && this.model.equals(cmodel))
			{
				System.out.println("Bread and object is equal");
				return true;
			}
			else {
				System.out.println("bread and object is not equal");
				return false;
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		return super.equals(obj);
	}
	
	
	
	
	
	
	
	
	
	
	
}
