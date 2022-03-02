class Medicine{

String[] medicine=new String[10];
int index;

void addMedicine(String drug)
{


	if(drug!=null)
	{
	System.out.println("Adding Drug :" +drug);
	this.medicine[index]=drug;
	this.index++;
	}
	else
	{
	System.out.println("Drug cannot be null");
	}
}
boolean find(String medicineName)
{
System.out.println("Finding Drug Name");	
boolean found=false;
	for(int drugIndex=0; drugIndex<this.medicine.length; drugIndex++)
	{
	String enterdrug=this.medicine[drugIndex];
		if(enterdrug.equals(medicineName))
		{
			System.out.println("Your Searching Drug is found : "+medicineName);
			found=true;
			
		}
	}
		if(!found)
		{
			System.out.println("Your Searching Drug is Not found : "+medicineName);
		}
		return found;
}
	
	


}



