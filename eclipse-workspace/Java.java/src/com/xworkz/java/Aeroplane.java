package com.xworkz.java;

public class Aeroplane {
	
	String name="SPICE JET";
	String model="spice 1210";
	int price=10000;
	boolean working=true;
	
	
	
	public Aeroplane(String name, String model, int price, boolean working) {
		super();
		/*this() --it is initialising the variables within the same class.
		 * super() ==> it is initialising the variables from sub-classes.
		 */
		System.out.println("PARAMETERIZED  AEROPLANE CONSTRUCTOR ");
		
		this.name = name;
		this.model = model;
		this.price = price;
		this.working = working;
	}


	public Aeroplane() {

		System.out.println("DEFAULT Aeroplane constructor");
	}
	
	
	@Override
	public int hashCode() {
        System.out.println("Aeroplane hascode method object which returns the int");
		return 12345;
	}
	
	
	@Override
	public String toString() {

		System.out.println("Returns string to string in Aeroplane");
		return "SPICE JET AEROPLANE";
	}
	
	
	@Override
	public boolean equals(Object obj) {

        System.out.println("Checking the value of the object is equal or not");
        
        
        if(obj==null) 
        {
        	System.out.println("we cannot acess aeroplane beacasue the object pointing to null");
        }
        else {
			System.err.println("we can compare obj with tyre here tyre is not equal to null");
			if(obj instanceof Aeroplane)
			{
				System.out.println("here Aeroplane is an instance of object so we can compare ");
				
				Aeroplane plane=(Aeroplane)obj; //  Areoplane         =(Aeroplane)
				String splane=plane.name;
				String smodel=plane.model;
				
				if(this.name.equals(splane)  && this.model.equals(smodel))
				
				{
					System.out.println("Aeroplane and object is equal in content");
					return true;
				}
				else
				 {
					System.err.println("Aeroplane and object is not equal in content");
					return false;
					
				
				 }
				/* generally we have object that is implicitly invoked in the memory,
				 * 
				 * Whenever we initiliase the instance, that particular instance is pointing to that object memeory.
				 * 
				 * whatever the properities having in that instance.
				 * 
				 * 
				 */
				
				
				
				
				
				
			}
			
        
        }      
        
        
          
		return super.equals(obj);
	}

}
