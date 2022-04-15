package com.xworkz.shallowclonnindanddeepclonning;

public class clonningRunner  {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		
		Address address=new Address("NELLORE","ANDHRA PRADESH",524004);
		Employee employee=new Employee(101,"SRI VIGNESH",24,"COMPUTER SCIENCE AND ENGINEERING(B.TECH)","GOOGLE",address);
		
		System.out.println(address);
		System.out.println(employee);
		
		Employee employee2= (Employee)employee.clone();// here it is supported clone not supported exception.
		                                                // so here we are doing typecasting.
		
		System.out.println("this is nothing but a shallow clonning here both values are same here by typecasting and with reference we are clonning");
		
		System.out.println("Employee details >>>>"+employee);
		System.out.println("Employee details2 >>>>"+employee2);
		
		System.out.println("here we are chamging the values but both the references are changed becuase of the clonning");
		System.out.println("The city names are changed in the both the refernce  becuase of the clonning");
		System.out.println("So we are doing  deep cloning,here we are implemented cloneable in the Employee and Address and hence the values are same previously ");
		
		employee2.getAddress().setCityname("BANGLORE-NELLORE");
		
		System.out.println("Employee details >>>>"+employee);
		System.out.println("Employee details2 >>>>"+employee2);
		
		
		
		
		

	}
	
	

}
