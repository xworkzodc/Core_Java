package com.xworkz.associations;
import com.xworkz.associations.Hotel;
import com.xworkz.associations.Vendor;
import com.xworkz.associations.VendorType;

public class HotelRunner {
	
	public static void main(String[] args) {
		
		String VendorName="SHAKTI ENTERPRISES";
		
		Vendor vendor=new Vendor(VendorType.VEGETABLE, 2000, VendorName);
		
		Hotel hotel=new Hotel(new Vendor(VendorType.VEGETABLE, 2000, VendorName));
		
		Hotel hotell=new Hotel(vendor);
		
		hotel.buyvegetables();
		
		
		
		
		
	}
	
	
	
	
	

}
