package com.xworkz.inhertance.thing;

public class Car {

	public Car()
	{
		System.out.println("DEFAULT ARGUEMENT CAR CONSTRUCTOR ");
	}
	
	@Override
	public  int hashCode()
	{
		System.out.println("Running haash code from satellite");
		return 0;
	}
	

}
