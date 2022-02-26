class HairDryerStarter{
public static void main(String[] args){

HairDryer hairdryer=new HairDryer();
hairdryer.speed=100;
hairdryer.speed=200;
hairdryer.speed=300;
hairdryer.watts=40;
hairdryer.watts=600;
hairdryer.speed=1000;
System.out.println(hairdryer.speed);
System.out.println(hairdryer.watts);
System.out.println(hairdryer.hotair);

hairdryer.displayDetails();

HairDryer hairdryer1=new HairDryer();
System.out.println(hairdryer1);
System.out.println(hairdryer1.speed);
System.out.println(hairdryer1.watts);
System.out.println(hairdryer1.hotair);
hairdryer1.watts=1000;
System.out.println(hairdryer1.speed);
System.out.println(hairdryer1.watts);
System.out.println(hairdryer1.hotair);

hairdryer.displayDetails();


HairDryer hairdryer2=new HairDryer(2000);
System.out.println(hairdryer2);

hairdryer.displayDetails();

HairDryer hairdryer3=new HairDryer();
System.out.println(hairdryer3);
System.out.println(hairdryer3.speed);
System.out.println(hairdryer3.hotair);
System.out.println(hairdryer3.watts);

hairdryer.displayDetails();

HairDryer hairdryer30=new HairDryer(10000);
System.out.println(hairdryer30);
System.out.println(hairdryer30.speed);
System.out.println(hairdryer30.hotair);
System.out.println(hairdryer30.watts);

hairdryer.displayDetails();

hairdryer3.displayDetails();

hairdryer30.changeSpeed();

}

}