package com.xworkz.associations;


public class Vendor {

	private VendorType vendortype;
	private double billprice;
	private String name;
	
	public Vendor(VendorType vendortype, double billprice, String name) {
		super();
		this.vendortype = vendortype;
		this.billprice = billprice;
		this.name = name;
	}
	
	
	public boolean sell()
	{
		System.out.println("Invoked sell method");
		
		if(this.billprice>1000) {
			return true;
		}
		return false;
		
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getBillprice() {
		return billprice;
	}
	
	
	public VendorType getVendortype() {
		return vendortype;
	}
	
	
	
	
	

}
