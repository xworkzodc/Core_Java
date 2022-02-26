//Soap--name,price,color,size,weight,manFacDate,tmf;
//initialise all the instance variables,update methods +7 methods+all variables
//7 get methods to return the address of the instance variables.
//3 copies of soap.

class Soap{

String name;
double price;
Colorrs color;
int size;
float weight;
int manFacDate;
boolean tmf;

void about()
{
	System.out.println(name);
	System.out.println(price);
	System.out.println(color);
	System.out.println(size);
	System.out.println(weight);
	System.out.println(manFacDate);
	System.out.println(tmf);
}
void updateName()
{
	this.name="Santoor";
	System.out.println(this.name);


}

void updateName(String name)
{
	this.name=name;
	System.out.println(this.name);
}

void updatePrice()
{
	this.price=150;
	System.out.println(this.price);
	
}

void updatePrice(double price)
{
	this.price=price;
	System.out.println(this.price);
}

void updateColorrs()
{
	this.color=Colorrs.WHITE;
	System.out.println(this.color);
}

void updateColorrs(Colorrs color)
{
	this.color=color;
	System.out.println(this.color);
}

void updateSize()
{
	this.size=123;
	System.out.println(this.size);
}


void updateSize(int size)
{
	this.size=size;
	System.out.println(this.size);
}

void updateWeight()
{
	this.weight=10;
	System.out.println(this.weight);
}

void updateWeight(float weight)
{
	this.weight=weight;
	System.out.println(this.weight);
}

void updatemanFacDate()
{
	this.manFacDate=2022;
	System.out.println(this.manFacDate);
}

void updateBoolean()
{
	this.tmf=true;
	System.out.println(this.tmf);
}

void updateBoolean(boolean tmf)
{
	this.tmf=tmf;
	System.out.println(this.tmf);
}

String getName()
{   
    return this.name;
}

double getPrice()
{
	
	return this.price;
}

Colorrs getColorrs()
{
	
	return this.color;
}


int getSize()
{
	return this.size;
}

float getWeight()
{
	
	return this.weight;
}

int getmanFacDate()
{
	return this.manFacDate;
}

boolean getTmf()
{
	
	return this.tmf;
}


























}