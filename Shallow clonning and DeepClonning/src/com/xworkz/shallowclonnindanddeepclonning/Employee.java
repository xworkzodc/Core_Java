package com.xworkz.shallowclonnindanddeepclonning;

public class Employee implements Cloneable {
	
	private int id;
	private String name;
	private int age;
	private String qualification;
	private String empCompanyName;
	private Address address;
	
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Employee employee=(Employee)super.clone();       //deep cloning process
		employee.setAddress((Address)address.clone());
		
		return employee;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", qualification=" + qualification
				+ ", empCompanyName=" + empCompanyName + ", address=" + address + "]";
	}



	public Employee(int id, String name, int age, String qualification, String empCompanyName, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.empCompanyName = empCompanyName;
		this.address = address;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmpCompanyName() {
		return empCompanyName;
	}
	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
