package com.xworkz.java;

public class Bread {

	
	public Bread() {
		// TODO Auto-generated constructor stub
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("RUNNING HASH CODE FROM CHILD CLASS BREADSTARTER MAIN METHOD");
		return 12345678;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("RUNNING STRING TO STRING FROM Bread");
		return "breads";
	}
	
	
}
