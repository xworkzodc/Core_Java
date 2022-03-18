package com.xworkz.holi.java;

public class holistarter {

	public static void main(String[] args) {

		mobile mob1=new mobile("OPPO","OPPO123",5000,12);
		System.out.println(mob1.hashCode());
		System.out.println(mob1);
		
		System.out.println(mob1.toString());
		System.out.println(mob1);
		
		
		mobile mob2=new mobile("OPPO","OPPO123",7000,15);
		System.out.println(mob2.toString());
		System.out.println(mob2);
		
		System.out.println(mob2.hashCode());
		System.out.println(mob2);
		
		boolean scheck=mob1.equals(mob2);
		System.out.println(scheck);
		
		
		product sproduct=new product("OVEN",12544,12345.00,Type.GOOD);
		System.out.println(sproduct.hashCode());
		System.out.println(sproduct);
		
		System.out.println(sproduct.toString());
		System.out.println(sproduct);
		
		product sproduct1=new product("OVENN",1244,12345.00,Type.BAD);
		System.out.println(sproduct1.hashCode());
		System.out.println(sproduct1);
		
		System.out.println(sproduct1.toString());
		System.out.println(sproduct1);
		

		boolean scheck1=sproduct.equals(sproduct1);
		System.out.println(scheck1);
		
		
	}

}
