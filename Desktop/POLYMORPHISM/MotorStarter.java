class MotorStarter{

public static void main(String[] args){

Motor motor=new Motor();
System.out.println(motor.rpm);
boolean work=true;
System.out.println(work);
System.out.println(MotorFuelType.ETHANOL);


motor.run();
motor.stop();

Motor motor1=new WaterPumpMotor();
System.out.println(motor1.rpm);
boolean work1=true;
System.out.println(work1);
System.out.println(MotorFuelType.ETHANOL);

motor1.run();
motor1.stop();


WaterPumpMotor motor2=new WaterPumpMotor();
System.out.println(motor2.rpm);
boolean work2=true;
System.out.println(work2);
System.out.println(MotorFuelType.ETHANOL);

motor2.run();
motor2.stop();

motor2.reset();

MotorOperater motor3=new MotorOperater();
motor3.operate();

WaterPumpMotor motor4=(WaterPumpMotor)motor1;///type casted
motor4.run();
motor4.stop();


Motor motor6=new Motor(1500,true,MotorFuelType.GASOLINE);














}


}