package com.xworkz.exceptions;
import javax.naming.NameAlreadyBoundException;

import com.xworkz.exceptions.NameService;
public class NameServiceRunner {
	
	
	public static void main(String[] args) throws NameAlreadyBoundException
	{
		NameService nameService=new NameService();
		nameService.add("XWORKZ");
		try {
			nameService.add("INFOSYS");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		nameService.add("Google");
		nameService.add("WIPRO");
		nameService.add("TCS@#");
		try {
			nameService.add("SYNCHRONOUS");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
