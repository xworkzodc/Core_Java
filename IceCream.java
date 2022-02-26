//ICECREAM---flavour,cost,color,packingType:enum,company
//on update methos to update all instance variables
//get methods for all the instance variables
//create 3 instances

class IceCream{

Flavour flavour;
int cost;
Colors color;
PackagingType  packingtype;
String company;

//stem.out.println(=======UPDATING FLAVOUR INSTANCE VARIABLES=====); DOUBT

void updateFlavour()
{
	System.out.println("UPDATING FLAVOUR REQUIREMENTS :");
	this.flavour=flavour;
	System.out.println(this.flavour);
	this.flavour=Flavour.VANILLA;
	System.out.println(this.flavour);
	
}

void updateFlavour(Flavour flavour)
{
	System.out.println("UPDATING flavour new properities");
	this.flavour=flavour;
	System.out.println(this.flavour);
}

void updateCost()
{
	this.cost=cost+100;
	System.out.println(this.cost);
}

void updateCost(int cost)
{
	this.cost=cost;
	System.out.println(this.cost);
}

void updateColors()
{
	this.color=Colors.WHITE;
	System.out.println(this.color);
}


void updateColors(Colors color)
{
	this.color=color;
	System.out.println(this.color);
}

void updatePackagingType()
{
	this.packingtype=PackagingType.ONLINE;
	System.out.println(this.packingtype);
}

void updatePackagingType(PackagingType packingtype)
{
	this.packingtype=packingtype;
	System.out.println(this.packingtype);
	
}

void updateCompany()
{
	this.company=company+"dreams";
	System.out.println(this.company);
}

void updateCompany(String company)
{
	this.company=company;
	System.out.println(this.company);
}


String getFlavour()
{
	System.out.println("geting Flavour properities");
	return "VANILLA";
}

int getPrice()
{
	return 0;
}

Colors getColors()
{
	return this.color;
}

PackagingType getPackagingType()
{
	return PackagingType.OFFLINE;
}

String getCompany()
{
	
	return this.company+"SUNRISE";
}














}