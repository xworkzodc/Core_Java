package com.xworkz.java;

import com.xworkz.java.Bread;



public class BreadStarter {

	public static void main(String[] args) {
		
		Aeroplane plane=new Aeroplane();
		System.out.println(plane);
		
		Aeroplane plane1=new Aeroplane("SPICE JET","SPICE 1430",12345,true);
		
		System.out.println(plane1.hashCode());
		System.out.println(plane1);
		
		Aeroplane plane2=new Aeroplane("SPICE JET","SPICE 1430",12345,false);
		
		System.out.println(plane1.hashCode());
		System.out.println(plane1);
		
		boolean refplane=plane1.equals(plane2);
		System.out.println(refplane);
		
		
		
		
		
		
		
		
		BreadStarter bread=new BreadStarter();
		
		System.out.println(bread);
		int breads=bread.hashCode();
		System.out.println(breads);
		
		System.out.println(bread.toString());
		System.out.println(bread);
		
	    int bread1=bread.hashCode();
	    System.out.println(bread1);
	    
	    Bread breadss=new Bread("JAM","JAM123",30,false);
	    System.out.println(breadss.hashCode());
	    System.out.println(breadss);
	    
	    System.out.println(breadss.toString());
	    System.out.println(breadss);
	    
	    
	    
	    Bread breadss1=new Bread("JAMMA","JAMA123",50,true);
	    System.out.println(breadss1.hashCode());
	    System.out.println(breadss1);
	    
	    System.out.println(breadss1.toString());
	    System.out.println(breadss1);
	    
	    boolean xworkzbread=breadss.equals(breadss1);
	    System.out.println(xworkzbread);
	    
	    
	    
	    
	    
	    
	    System.out.println("bread class from com.xworkz.java package");
	    
	    Bread breadd = new Bread();
	    System.out.println(breadd);
		int brea=breadd.hashCode();
		System.out.println(breadd);
		
		System.out.println(breadd.toString());
		System.out.println(breadd);
		
	    int bread2=bread.hashCode();
	    System.out.println(breadd);
	    
	    System.out.println("glass class from com.xworkz.java package");
	    
	    Glass glass=new Glass();
	    System.out.println(glass);
		int glas=glass.hashCode();
		System.out.println(glass);
		
		System.out.println(glass.toString());
		System.out.println(glass);
		
	    int glass1=bread.hashCode();
	    System.out.println(glass);
	    
	    Glass glas1=new Glass("LUCKY","LUCKY11233",12345,true);
	    
	   int sglas=glas1.hashCode();
	   System.out.println(sglas);
	   
	   String sglas1=glas1.toString();
	   System.out.println(sglas1);
	   
	   Glass glas2=new Glass("LUCKY","LUCKYY1212",5678,true);
	   String sglas2=glas2.toString();
	   System.out.println(glas2);
	   
	   int sglas3=glas2.hashCode();
	   System.out.println(glas2);
	   
	   boolean sample=glas1.equals(glas2);
	   System.out.println(sample);
	   
	   
	    
	    System.out.println(" KeyBunch class from com.xworkz.java package");
	    
	    Keybunch kbunch=new Keybunch();
	    System.out.println(kbunch);
		int bunch=kbunch.hashCode();
		System.out.println(kbunch);
		
		System.out.println(kbunch.toString());
		System.out.println(kbunch);
		
	    int bunch1=kbunch.hashCode();
	    System.out.println(kbunch);
	    
	    System.out.println("===================BOOLEAN KEYBUNCH EQUALS OBJECT METHOD==================== ");
	    
	    Keybunch kbunch1=new Keybunch("LOCsjkfkhf","LO3",12345,true);
	    
	    int keybunch1=kbunch1.hashCode();
	    System.out.println(kbunch1);
	    
	    String keybunch2=kbunch1.toString();
	    System.out.println(kbunch1);
	    
	    
	    
           
	    Keybunch kbunch2=new Keybunch("LOCskufsiysK","LOCK123",1234,false);
	    
	    int keybunch23754d6dydydhyryydyredyfiuytr78reyyffy=kbunch2.hashCode();
	    System.out.println(kbunch2);
	    
	    String keybunch3=kbunch2.toString();
	    System.out.println(kbunch2);
	    
	    boolean samplekeybunch=kbunch1.equals(kbunch2);
	    System.out.println(samplekeybunch);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    System.out.println("gun class from com.xworkz.java package ");
	    
	    Gun gun=new Gun();
	    System.out.println(gun);
		int gun1=gun.hashCode();
		System.out.println(gun);
		
		System.out.println(gun.toString());
		System.out.println(gun);
		
	    int gun2=gun.hashCode();
	    System.out.println(gun);
	    
	    System.out.println("=====================EQUAL OBJECT METHOD============");
	    
	    Gun gunn1=new Gun("VICKY","RDX147",123456,true);
	    System.out.println(gunn1);
	    
	    int sgun=gunn1.hashCode();
	    System.out.println(sgun);
	    
	    String sgun1=gunn1.toString();
	    System.out.println(sgun);
	    
	    Gun gunn2=new Gun("VIVKY","RDX147",123456,false);
	    
	    int sgun3=gunn2.hashCode();
	    System.out.println(sgun3);
	    
	    String sgun4=gunn2.toString();
	    System.out.println(sgun);
	    
	    boolean samplee=gunn1.equals(gunn2);
	    System.out.println(samplee);
	    
	    
	    
	    System.out.println("HELICOPTER  class from com.xworkz.java package");
	    
	    Helicopter helicopter=new Helicopter();
	    
	    System.out.println(helicopter);
		int helicopter1=helicopter.hashCode();
		System.out.println(helicopter);
		
		System.out.println(helicopter.toString());
		System.out.println(helicopter);
		
	    int helocopter2=helicopter.hashCode();
	    System.out.println(helicopter);
	    
	    
	    System.out.println("================HELICOPTER EQUALS METHOD ===========================");
	    
	    Helicopter helicopterr1=new Helicopter("vicky","vivky123",1234567,true);
	    
	    int sname=helicopterr1.hashCode();
	    
	    System.out.println(sname);

	    String smodel=helicopterr1.toString();
	    System.out.println(smodel);
	    
	    Helicopter helicopterr2=new Helicopter("vicky","vivky123",1234567,false);
	    
	    int sname1=helicopterr1.hashCode();
	    
	    System.out.println(sname1);

	    String smodel1=helicopterr1.toString();
	    System.out.println(smodel1);
	    
	    boolean equals=helicopterr1.equals(helicopterr2);
	    System.out.println(equals);
	   
	    
	    System.out.println("MISSILES  class from com.xworkz.java package");
	    Missiles missiles=new Missiles();
	    
	    System.out.println(missiles);
		int missiles1=missiles.hashCode();
		System.out.println(missiles);
		
		System.out.println(missiles.toString());
		System.out.println(missiles);
		
	    int missiles2=missiles.hashCode();
	    System.out.println(missiles);
	    
	    System.out.println("ROCKET  class from com.xworkz.java package");
	    
	    Rocket rocket=new Rocket();
	    System.out.println(rocket);
		int rocket1=rocket.hashCode();
		System.out.println(rocket);
		
		System.out.println(rocket.toString());
		System.out.println(rocket);
		
	    int rocket2=rocket.hashCode();
	    System.out.println(rocket);
	    
	    System.out.println("SATELLITE  class from com.xworkz.java package ");
	    Satellite satellite=new Satellite();
	    
	    System.out.println(satellite);
		int satellite1=satellite.hashCode();
		System.out.println(satellite);
		
		System.out.println(satellite.toString());
		System.out.println(satellite);
		
	    int satellite2=satellite.hashCode();
	    System.out.println(satellite);
	    
	    System.out.println("TYRE class from com.xworkz.java package");
	    Tyre tyre=new Tyre();
	    System.out.println(tyre);
		int tyre1=tyre.hashCode();
		System.out.println(tyre);
		
		System.out.println(tyre.toString());
		System.out.println(tyre);
		
	    int tyre2=tyre.hashCode();
	    System.out.println(tyre);
	    
	    Tyre reftyre=new Tyre("MRF",1000,15,true);
	    System.out.println(reftyre);
	    
	    System.out.println(reftyre.hashCode());
	    System.out.println(reftyre);
	    
	    Tyre reftyre1=new Tyre("MRF",100,16,false);
	    System.out.println(reftyre1);
	    
	    System.out.println(reftyre1.hashCode());
	    System.out.println(reftyre1);
	    
	    String refname="crp";
	    
	    boolean refnmeequal=reftyre.equals(reftyre1);
	    System.out.println("OBJECT EQUAL =" +refnmeequal);
	    
	    Tyre retyre1=new Tyre("DOL",12345,12,false);
	    System.out.println(reftyre1.hashCode());
	    System.out.println(reftyre1);
	    
	    Tyre retyre2=new Tyre("DOLly",1245,19,true);
	    
	    System.out.println(retyre2.hashCode());
	    System.out.println(retyre2);
	    
	    boolean retyre3=retyre1.equals(retyre2);
	    System.out.println(retyre3);
	    
	    
	    
	    
	 
	}

}
