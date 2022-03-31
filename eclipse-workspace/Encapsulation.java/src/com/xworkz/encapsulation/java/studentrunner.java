package com.xworkz.encapsulation.java;


public class studentrunner {

	public static void main(String[] args) {

		
		student s=new student();
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s.setName("SRI VIGNESH");
		System.out.println(s.getName());
		s.setAge(29);
		System.out.println(s.getAge());
	}

}
