//Charger — color:enum,type:enum,watts,brand,pinType:enum,usb,wireLength,working
//16 update methods, about(),update(….);

class Charger
{

Color color;
Type type;
Watts watts;
String brand;
PinType pinType;
String usb;
int wireLength;
boolean working=true;

void about()
{
	System.out.println(color);
	System.out.println(type);
	System.out.println(watts);
	System.out.println(brand);
	System.out.println(pinType);
	System.out.println(usb);
	System.out.println(wireLength);
	System.out.println(working);
}

void updateColor()
{
	System.out.println("updating the color properities");
	this.color=Color.RED;
	System.out.println(this.color);
	this.color=Color.WHITE;
	System.out.println(this.color);
	this.color=Color.GREEN;
	System.out.println(this.color);
	this.color=Color.PINK;
	System.out.println(this.color);
	
}


void updateColor(String brand,String usb)
{
	System.out.println("UPDATING COLOR PRPOERITIES");
	this.brand=brand;
	this.usb=usb;
	System.out.println("UPDATED BRAND ="+this.brand);
	System.out.println("UPDATED USB ="+this.usb);
	
}

void updateType()
{
	System.out.println("UPDATING TYPE OF THE CHARGER");
	this.type=Type.fastchargers;
	System.out.println("UPDATED CHARGER ="+this.type);
}
 
void updateType(String name,int wireLength)
{
	System.out.println("REUPDATING THE TYPE PROPERITIES");
	this.brand=brand;
	this.wireLength=wireLength;
	System.out.println("UPDATED BRAND ="+this.brand);
	System.out.println("UPDATED WIRELENGTH ="+this.wireLength); 	
}

void updateWatts()
{
System.out.println("UPDATING WATTS REQUIREMENTS");
this.watts=Watts.TENWATTS;
System.out.println("UDATED WATTS===="+this.watts);
}


void updateWatts(Watts watts,boolean working)
{
	System.out.println("UPDATING WATTS NEW REQUIREMENTS");
	this.watts=watts;
	this.working=working;
	System.out.println("updated watts ="+this.watts);
    System.out.println("Updated working ="+this.working);
	
}


void updateBrand()
{
	System.out.println("UPDATING BRAND PROPERITIES");
	this.brand=brand;
	System.out.println(this.brand);
	this.brand=brand+"LENOVO";
	System.out.println(this.brand);
	
	this.brand="DELL";
    System.out.println("LATEST UPDATED BRAND  = "+this.brand);
	
}


void updateBrand(String name)
{
	System.out.println("NEWLY UPDATED BRAND PROPERITIES : ");
	this.brand=brand;
	System.out.println("UPDATED BRAND == "+this.brand);
	
	
}


void updatePinType()
{
	System.out.println("updating pintype properities :");
	this.pinType=pinType.USBA;
	System.out.println(this.pinType);
}


void updatePinType(int wirelength,PinType pinType)
{
	System.out.println("UPDATING PINTYPE NEWLY LAUNCHED :");
	this.wireLength=wireLength;
	this.pinType=pinType;
	System.out.println("WIRELENGTH UPDATED SUCESSFULLY:"+this.wireLength);
	System.out.println("UPDATED PINTYPE SUCESSFULLY:"+this.pinType);
	
}

void updateusb()
{
	
	this.usb=usb+"CABLEC";
	System.out.println(this.usb);
}

void updateusb(String brand)
{
	System.out.println("UPDATING USB NAME :");
	this.brand=brand;
	System.out.println("updated ==== "+this.brand);
}


void updateWireLength()
{
	System.out.println("UPDATING wirelength properities :=");
	this.wireLength=wireLength;
	System.out.println("updated secessfuly"+this.wireLength);
	
}

void updateWireLength(String brand)
{
	System.out.println("UPDATED WIRELENGTH PROPERITIES ");
	this.brand=brand;
	System.out.println("UPDATED SUCESSFULLY"+this.brand);
}


void updateboolean()
{
	System.out.println("UPDATING BOOLEAN PROPERITIES :");
	this.working=working;
	System.out.println(this.working);
}

void updateboolean(boolean working)
{
	System.out.println("UPDATING BOOLEAN PROPERITIES :");
	this.working=working;
	System.out.println(this.working);
	
}




void updateChargerProperities(Color color,Type type,Watts watts,String brand,PinType pinType,int wireLength,boolean working)
{
	
	this.color=color;
	this.type=type;
	this.watts=watts;
	this.brand=brand;
	this.pinType=pinType;
	this.wireLength=wireLength;
	this.working=working;
	System.out.println(this.color);
	System.out.println(this.type);
	System.out.println(this.watts);
	System.out.println(this.brand);
	System.out.println(this.wireLength);
	System.out.println(this.working);
	
}



















}