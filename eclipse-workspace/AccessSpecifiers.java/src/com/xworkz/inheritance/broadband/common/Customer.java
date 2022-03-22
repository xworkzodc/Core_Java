package com.xworkz.inheritance.broadband.common;
import com.xworkz.inheritance.broadband.ModemInternet;

public class Customer {
	void connecttocustomerdetails()
	{
		System.out.println("Acessing customer internet instances");
		Internet internet=new Internet();
		System.out.println(internet.bandwidth);
		System.out.println(internet.name);
		System.out.println(internet.plan);
		System.out.println(internet.provider);
		System.out.println(internet.type);
		
		
		FibreInternet fibreinternet=new FibreInternet();
		System.out.println(fibreinternet.bandwidth);
		System.out.println(fibreinternet.name);
		System.out.println(fibreinternet.plan);
		System.out.println(fibreinternet.provider);
		System.out.println(fibreinternet.type);
		
		
		
		
		
		System.out.println();
	}

}
