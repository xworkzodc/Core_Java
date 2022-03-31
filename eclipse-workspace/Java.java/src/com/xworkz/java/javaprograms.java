package com.xworkz.java;
class A {	
    String m1(String x){
	System.out.println("One");
	return "ABC";
}
String m1(String y,String yy){
	System.out.println("Two");	
	return "PQR";
}
public static void main(String[] args){
A a = new A();
a.m1("ABC");

}
}

