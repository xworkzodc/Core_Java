package com.xworkz.inheritance.broadband;
import com.xworkz.inheritance.broadband.common.Internet;

public class ModemInternet extends Internet {
	public void details()
	{
		System.out.println(super.bandwidth);
		System.out.println(super.plan);
		System.out.println(super.provider);
		System.out.println(super.name);
		
	}
	
	@Override
	public void connect() {

		System.out.println("Oveririding connect method from ANOTHER PACKAGE WHICH IS PROTECTED,PUBLIC");
		super.connect();
	}

}
