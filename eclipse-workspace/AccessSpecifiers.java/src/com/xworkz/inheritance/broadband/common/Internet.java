package com.xworkz.inheritance.broadband.common;

public class Internet {
	
	public  String name="INTERNET";
	public String provider="ACT INTERNET";
	public   String type="ONLINE";
	public String plan="GOLDEN ";
	public  double bandwidth=123.0;
	
	public Internet() {
       System.out.println("Default Internet Constructor");
		
	}
	
	public void connect()
	{
		System.out.println("Running connect method............... ");
	}
	
	
	

}
