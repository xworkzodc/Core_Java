package com.xworkz.java;

public class Tyre {
	
	String company;
	int price;
	int modelNo;
	boolean available;
	
	
	public Tyre(String company, int price, int modelNo, boolean available) {
		super();
		System.out.println("PARAMETERISED TYRE CONSTRUCTOR");
		this.company = company;
		this.price = price;
		this.modelNo = modelNo;
		this.available = available;
	}

	public Tyre() {
		// TODO Auto-generated constructor stub
		System.out.println("DEFAULT TYRE CONSTRUCTOR");
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int refhcode=super.hashCode();
		System.out.println(refhcode);
		System.out.println("hash code SATELLITE");
		return 12345;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("String to string TYRE");
		return "TYRE";
	}
	
	
	@Override
	public boolean equals(Object obj) {
	
		System.out.println("boolean object method ");
		System.out.println("running equals object of the tyre");
		
		if(obj==null)
		{
			System.out.println("we cannot compare tyre with null beacuse tyre is not a  a null");
			
		}
		else {
			System.out.println("we can compare obj with tyre here tyre is not equal to null");
			if(obj instanceof Tyre)
			{
				System.out.println("here tyre is an instance of object so we can compare ");
				Tyre casting=(Tyre)obj;//tyPe casting
				String scompany=casting.company;
				
				if(this.company.equals(scompany));
				System.out.println("Tyre and obj are equal here by the help of casting");
				return true;
				
			}
			
			else {
				System.out.println("we cannot compare because its not pointing to obj of instance in the memory");
				return false;
			}
			
		}
		
		return super.equals(obj);
	}
	
	
	
	
	
	
	
	
	
	
	

}
