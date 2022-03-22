package com.xworkz.inheritance.broadband.common;

public class FibreInternet extends Internet {
	
	 public void details()
	 {
		 System.out.println(super.bandwidth);
		 System.out.println(super.plan);
		 System.out.println(super.provider);
		 System.out.println(super.name);
	 }
	 
	 @Override
	public void connect() {
		 System.out.println("Over riding method from parent class");
		super.connect();
	}

}
