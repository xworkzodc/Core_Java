package com.xworkz.holi.java;

public class mobile {
	
	String brand;
	String model;
	double imei;
	int cost;
	
	public mobile(String brand, String model, double imei, int cost) {
		super();
		System.out.println("PARAMETERISED DEFAULT CONSTRUCTOR");
		this.brand = brand;
		this.model = model;
		this.imei = imei;
		this.cost = cost;
	}

	
	public mobile() {
		System.out.println("DEFAULT MOBILE CONSTRUCTOR");

	}
	
	@Override
	public int hashCode() {
		
		System.out.println("Returning hashcode for the mobile");

		return 12345;
	}

	
	@Override
	public String toString() {
		
		System.out.println("Returning string of the mobile which is overiden");
		
		return "OPPO THE SMARTEST MOBILE";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("creating and running the boolean object ");

		System.out.println("it checks the objects are eqaul are not if eqaul return true else false ");
		
		if(obj==null)
		{
			System.out.println("Object is eqaul to null ");
		}
		else {
			System.out.println("Object is not equal to null");
			
			if(obj instanceof mobile);
			{
				System.out.println("mobile is pointing tords object at the instance");
				
				mobile ref=(mobile)obj;
				
				String sbrand=ref.brand;
				String smodel=ref.model;
				double simei=ref.imei;
				int scost=ref.cost;
				
				if(this.brand.equals(sbrand) && this.model.equals(smodel) && this.imei==simei && this.cost==scost );
				{
				System.out.println("Here the objects  of both the instance are equal ");
				return true;
			    }
				
				 
			
					
			}
				
			
			 
	}
		return super.equals(obj);
}
}
