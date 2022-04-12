package com.xworkz.exceptions;
import  com.xworkz.exceptions.ArrayIndexException.*;
import  com.xworkz.exceptions.emailStoppbleException.*;
import    com.xworkz.exceptions.EmailService;
 

public class EmailServiceRunner {
	
	public static void main(String[] args) throws emailStoppbleException
	{
		EmailService emailservices=new EmailService();
		
		try {
			emailservices.add("srivignesh123@gmail.com");
			emailservices.add("rdsvignesh2015@gmail.com");
			emailservices.add("dorasrivignesh@gmail.com");
			emailservices.add("vicky@gmail.com");
			emailservices.add("jntua@gmail.edu.in");
			emailservices.add("ttd@gmail.com");
			emailservices.add("xworkz@gmail.com");
			emailservices.add("jntuk@gmail.com");
			emailservices.add("svuniversity@gmail.com");
			emailservices.add("army@gov.in");
			emailservices.add("airforce@gmail.com");
			emailservices.add("navy@gmail.com");
			emailservices.add("navy@gmail.com");
			emailservices.add("madhu@gmail.com");
			emailservices.add("sneha@gmail.com");
			emailservices.add("afreen@gmail.com");
			emailservices.add("neelesh@gmail.com");
			emailservices.add("vignesh@edu.in");
			emailservices.add("uma@gmail.com");
			emailservices.add("rmrphy.9@gmail.com");
			emailservices.add("bhaktichannel@gmail.com");
			emailservices.add("bhaktichannel@gmail.com");
		} catch (ArrayIndexException e) {

			e.printStackTrace();
		}
		
		catch(emailStoppbleException e)
		{
			e.printStackTrace();
		}

		}
		
		
		
	}

