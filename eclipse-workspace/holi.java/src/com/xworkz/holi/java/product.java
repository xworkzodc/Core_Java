package com.xworkz.holi.java;

public class product {
	
	String brand;
	int cost;
	double quantity;
	Type type;
	
	
	public product(String brand, int cost, double quantity, Type type) {
		super();
		System.out.println("PARAMETERISED product constructor");
		this.brand = brand;
		this.cost = cost;
		this.quantity = quantity;
		this.type = type;
	}
	
	public product() {

		System.out.println("DEFAULT CONSTRUCTOR");
	}
	
	
	@Override
	public boolean equals(Object obj) {

		System.out.println("RUNNING OBJECT AND EQUAL OBJECT");
		if(obj==null)
		{
			System.out.println("HERE OBJECT IS EQUAL TO NULL");
		}
		else
		{
			System.out.println("Here object is not null");
			
			if(obj instanceof product);
			{
				System.out.println("Here product is object we can check");
				
				product ref=(product)obj;  //type casting the product

				String sbrand=ref.brand;
				int scost=ref.cost;
				double squantity=ref.quantity;
				Type stype=ref.type;
				
				if(this.brand.equals(sbrand) && this.cost==scost && this.quantity==squantity && this.type==stype);
				
				System.out.println("Here both the instances of the object product are eqaul");
				return true;
			}
				
			
			
			
		}
		
		
		return super.equals(obj);
	}
	
	
	@Override
	public int hashCode() {
	 
		System.out.println("Returning hascode of the Product");
		return 11111111;
	}
	
	
	@Override
	public String toString() {
		System.out.println("Returns the string of the producrt");
		return "PRODUCT IS EXCELLENT";
	}
	
	
	

}
