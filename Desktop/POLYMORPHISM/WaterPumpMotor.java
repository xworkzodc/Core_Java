class WaterPumpMotor extends Motor{


void stop(boolean working)
{

boolean working2=false;
System.out.println(working2);

}


void run()
{
System.out.println("child class run method");
}

void stop()
{

System.out.println("child class stop method");
}

void run(boolean working)
{
boolean working1=true;
System.out.println(working1);
}



void reset()
{

System.out.println("RESET METHOD");

}

WaterPumpMotor()
{
	super(1000,true,MotorFuelType.GASOLINE);
	System.out.println("child class acquring parent class properities by using super constructor");
}





}