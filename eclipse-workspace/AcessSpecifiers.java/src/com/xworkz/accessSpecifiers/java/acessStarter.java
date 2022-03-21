package com.xworkz.accessSpecifiers.java;

import com.xworkz.accessSpecifier.java.Aeroplane;
public class acessStarter extends Aeroplane  {

	public static void main(String[] args) {

		acessStarter aeroplanes=new acessStarter();
		System.out.println(aeroplanes.name);
		System.out.println(aeroplanes.length);
		System.out.println(aeroplanes.model);
		System.out.println(aeroplanes.size);
		
		System.out.println("****************SECOND INSTANCE OF AEROPLANE ******************************");
		
		acessStarter aeroplanes1=new acessStarter();
		System.out.println("Aeroplane name ="+aeroplanes1.name);
		System.out.println("Aeroplane length ="+aeroplanes1.length);
		System.out.println("Aeroplane model ="+aeroplanes1.model);
		System.out.println("Aeroplane Size ="+aeroplanes1.size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
