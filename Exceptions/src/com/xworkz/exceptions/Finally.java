package com.xworkz.exceptions;

import java.security.cert.CertificateException;

public class Finally {
	
	
	static void functionA()
	{
		try {
			System.out.println("Function A is running");
			throw new RuntimeException("Demo");

		} finally {
			
			System.out.println("Finally method in FuntionA");

		
		}
		
	}
	
	
	
	static void functionB() 
	{
		try
		{
			System.out.println("Function B is running");
			System.exit(0);
		}
		finally {
			System.out.println("Finally method in Function B");
		}
	}
	
	
	
	static void functionC() 
	{
		try
		{
			System.out.println("Function c ");
			return;
		}
		finally
		{
			System.out.println("Finally in the method c");
			
		}
	}


	
	
	
	public static void main(String[] args) 
	{
		try {
			functionA();
		} catch (Exception e) {
           System.out.println("EXCEPTION CAUGHT");
			e.printStackTrace();
		}
		
			functionB();
		
		
		functionC();
		
	}
	
	
	
	
}
