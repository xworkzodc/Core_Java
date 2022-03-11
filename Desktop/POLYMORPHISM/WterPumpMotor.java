class WaterPumpMotor extends Motor{

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

void stop(boolean working)
{
this(working1);
boolean working2=false;
System.out.println(working2);

}

void reset()
{

System.out.println("REST METHOD");

}







}