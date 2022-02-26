//HairDryer --- speed, watts,hotAir , displayDetails(), changeSpeed();

//oe -- size:enum, price,brand,type:enum, displayDetails(),changePrice()

//adSet -- type:enum,price,volume,displayDetails(),changeVolume
SriVignesh
class HairDryer{
int speed=500;
float watts;
boolean hotAir=true;

HairDryer()
{

System.out.println("INVOKING DEFAULT CONSTRUCTOR");
}

HairDryer(int speed)
{

System.out.println("INVOKING PARAMETERISED  HAIR DRYER CONSTRUCTOR");
this.speed=speed;
}

void displayDetails()
{
System.out.println("INVOLING DISPLAY DETAILS");
System.out.println(speed);
System.out.println(watts);
System.out.println(hotAir);
this.speed=speed;
System.out.println(speed);

}

void changeSpeed()
{
	
	System.out.println("CHANGING SPEED DETAILS:");
	speed=speed+1000;
	System.out.println(speed);
}







}

