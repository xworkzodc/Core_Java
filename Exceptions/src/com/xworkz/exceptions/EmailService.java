package com.xworkz.exceptions;
import  com.xworkz.exceptions.ArrayIndexException.*;
import  com.xworkz.exceptions.emailStoppbleException.*;

public class EmailService {
	
	
	private String[] emails=new String[20];
	private int index=0;

	
	public EmailService() {

		System.out.println("Invoking default EmailService constructor");
		
	}

	
	
	
	public boolean add(String email) throws emailStoppbleException
	{
		if(email!=null)
		{
			if(!(email.length()>=3 && email.length()<=20) || email.matches("[A-Z a-z]+") ||
					email.matches(".edu") && email.matches(".com") && email.matches(".in") || email.matches("@"))
			{
				System.out.println("Email  found in the list ======"+email);
				throw new emailStoppbleException("Email entered is not valid ");
			}
			
		}
		else
		{
		
			if(index<emails.length)
			{
				this.emails[this.index]=email;
				this.index++;
				return true;
			}
			
			System.out.println("email is invalid"+email);
		}
		
		
		
		
		
		
		
		
	

	return false;
}
}


	

