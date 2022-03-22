package com.xworkz.inheritance;
import com.xworkz.inheritance.broadband.ModemInternet;
import com.xworkz.inheritance.broadband.common.FibreInternet;
import com.xworkz.inheritance.broadband.common.Internet;

public class InternetRunner extends Internet {
	
	public static void main(String[] args) {
		
		System.out.println("================Instance of Internet =========================");
		
		Internet internet=new Internet();
		
		System.out.println(internet.name);
		System.out.println(internet.provider);
		System.out.println(internet.bandwidth);
		System.out.println(internet.type);
		System.out.println(internet.plan);
		internet.connect();
		
		
		
		
		System.out.println("************************** Instance of FibreInternet***********************");
		
		FibreInternet fibreinternet=new FibreInternet();
		
		System.out.println(fibreinternet.provider);
		System.out.println(fibreinternet.name);
		System.out.println(fibreinternet.bandwidth);
		System.out.println(fibreinternet.plan);
		System.out.println(fibreinternet.type);
		
		fibreinternet.connect();
		fibreinternet.details();
		
		
		
		
		System.out.println("==========================Instance of ModemInternet==============================");
		ModemInternet modemInternet=new ModemInternet();
		System.out.println(modemInternet.provider);
		System.out.println(modemInternet.name);
		System.out.println(modemInternet.bandwidth);
		System.out.println(modemInternet.type);
		System.out.println(modemInternet.plan);
		
		modemInternet.details();
		modemInternet.connect();
		
		
		
		
		
	}

}
