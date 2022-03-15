//class Write a Program to add, find and display medicine's
//1. Name is not null, min chars is 4 , max chars is 50 
//2. Name should not be null 
//3. Add max of 10 Medicines 
//void addMedicine(String midicine);
//boolean find(String medicine);
//void displayMedicine();

class StringMethods
{


String[] medicines=new String[10];

int count;

void addMedicines(String name)
{
	
	if(name!=null)
	{
		System.out.println("adding "+name);
		this.medicines[count]=name;
		this.count++;
	}
	else{
		System.out.println("MEDICINES CANNOT FOUND");
	}
}

boolean find(String name)
{
	System.out.println("RUNNING FINDING NAMES");
	boolean found=false;
	for(int count=0;count<this.medicines.length;count++)
	{
		String nameArray=this.medicines[count];
		if(nameArray.equals(name))
		{
			System.out.println("MEDICINE FOUNDED="+name);
			found=true;
		}
	}
	if(!found)
	{
		System.out.println("YOUR MEDICINE IS NOT FOUND"+name);
	}
	return found;
	


}
}


