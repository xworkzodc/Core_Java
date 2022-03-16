package com.xworkz.java;

public class Rocket {

	public Rocket() {
		// TODO Auto-generated constructor stub
		System.out.println("DEFAULT ROCKET CONSTRUCTOR");
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("Hashcode ROCKET");
		return 12345;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("String to string ROCKET");
		return "ROCKET";
	}
}
