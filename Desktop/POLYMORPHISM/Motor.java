class Motor{

int rpm;
boolean working;
MotorFuelType type;

void run()
{
System.out.println(" DEFAULT RUN METHOD");
}


void stop()
{
System.out.println("STOP METHOD");
}

Motor(int rpm,boolean working,MotorFuelType type)
{
this.rpm=rpm;
this.working=working;
this.type=type;
System.out.println(rpm);
System.out.println(working);
System.out.println(type);	
	
	
	
}

}