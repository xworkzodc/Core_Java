package com.xworkz.java;

import com.xworkz.java.Bread;



public class BreadStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreadStarter bread=new BreadStarter();
		
		System.out.println(bread);
		int breads=bread.hashCode();
		System.out.println(breads);
		
		System.out.println(bread.toString());
		System.out.println(bread);
		
	    int bread1=bread.hashCode();
	    System.out.println(bread1);
	    
	    Bread breadd = new Bread();
	    System.out.println(breadd);
		int breadss=breadd.hashCode();
		System.out.println(breadd);
		
		System.out.println(breadd.toString());
		System.out.println(breadd);
		
	    int bread2=bread.hashCode();
	    System.out.println(breadd);
	    
	    
	    
        
	    
	    
		

	}

}
