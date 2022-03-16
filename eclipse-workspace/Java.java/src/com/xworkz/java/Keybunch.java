package com.xworkz.java;

public class Keybunch {
	
	
	String name="LOCK";
	String model="LOCK123";
	int price=123;
	boolean working=true;
	
	public Keybunch(String name, String model, int price, boolean working) {
		super();
		System.out.println("PARAMETRISED KEYBUNCH CONSTRUCTOR");
		this.name = name;
		this.model = model;
		this.price = price;
		this.working = working;
	}

	public Keybunch() {

		System.out.println("DEFAULT KEY BUNCH CONSTRUCTOR");
	}
	
	@Override
	public int hashCode() {

		System.out.println("RETURNGING THE VALUES OF AN INT");
		return 12345;
	}
	
	
	@Override
	public String toString() {
		System.out.println("IT RETURNS THE ADDRESS OF THE STRING");
		return "KEYBUNCH";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("HERE BOOLEAN OBJECT IS RUNNING");
		if(obj==null)
		{
			System.out.println("Object in the keybunch is pointing to null");
		}
		else {
			System.out.println("object in the jeybunch is not pointing to null");
		}
		
		if(obj instanceof Keybunch)
		{
			System.out.println("object is pointing towards instance of the keybunch");
			
			Keybunch keybunch=(Keybunch)obj;
			String sname=keybunch.name;
			String smodel=keybunch.model;
			
			
			
			if(this.name.equals(sname)   &&   this.model.equals(smodel));
			{
				System.out.println("Both instace variables are same in the memory of the keybunch which is pointing towards object");
				return true;
			}
			
			
			
			
			
		}
		else {
			System.out.println("object is not pointing towards the instance of the keybunch");
			return false;
		}
		
		
		
		
		
		
		
		
	}
	
	

}
