//Write a Program to add, find,update,delete and display Country
//1. Name is not null, min chars is 3 , max chars is 50 
//2. Name should not be null 
//3. Add max of 20 Countries
//4. Do not duplicate country 
//5. Check index exists before update 
//void add(String country);boolean find(String country);void display();update(int index,String country);delete(int index);delete(String country)

class Country
{
String[] countries=new String[20];
int count=0;

void add(String name)
{   
    if(countries.length==count)
	{
		return;
	}
	boolean value=find(name);
	if(value)
	{
		System.out.println("FINDING DUPLICATES");
		return;
	}
	System.out.println("RUNNING ADD METHOD");
	if(name!=null && name.length()>=3 && name.length()<=50 )
	{
	this.countries[count]=name;
	this.count++;
	System.out.println("ADDING ALL THE COUNTRY NAMES ="+name);
	}
	else
	{
		System.out.println("IT WILL NOT ADD THE COUNTRY");
	}
}

boolean find(String country)//INDIA
{
	for(int f=0;f<countries.length;f++)//f
	{
		String country1=this.countries[f];
		System.out.println(country1);
		if(country1!=null && country1.equals(country))
		{
			System.out.println("FINDING THE COUNTRY NAMES");
			return true;//here we are wriiting true beacause we are not initialising void in the above method.
		}
	}
		System.out.println("COUNTRY IS NOT FOUNDED");
		return false;
		
	
    }
	
	
void display()
{
	for(int i=0;i<countries.length;i++)
	{	
	System.out.println("DISPLAYING THE STRING VALUES = "+countries[i]);
    }
}


void delete(int index)
{
	if(index<countries.length)
	{	
    this.countries[index]=null;
	//null means 0
    System.out.println("DELETING THE INDEX VALUES ="+countries[index]);
	}
}

void delete(String countryN)
{
	for(int d=0;d<countries.length;d++)
	{
		if(this.countries[d]!=null && this.countries[d].equals(countryN))
		{
			this.countries[d]=null;
			
		}
	}
}


	
	
	
	
	
}



