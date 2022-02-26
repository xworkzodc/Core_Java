class IceCreamStarter{

public static void main(String[] args){

IceCream icecream=new IceCream();

System.out.println("=========UPDATING FLAVOUR PROPERITIES=======");

icecream.updateFlavour();

icecream.updateFlavour(Flavour.CHOCOBAR);

System.out.println("=========COST PROPERITIES============");

icecream.updateCost();

icecream.updateCost(1000);

System.out.println("updating color properities");

icecream.updateColors();

icecream.updateColors(Colors.YELLOW);

System.out.println("=========PACKING TYPE======");

icecream.updatePackagingType();

icecream.updatePackagingType(PackagingType.OFFLINE);

System.out.println("===========company details=====");
icecream.updateCompany();

icecream.updateCompany("SUNSET");


System.out.println("**********UPDATING get methods by using instance variables********************");

String flavour=icecream.getFlavour();
System.out.println("UPDATING FLAVOUR="+flavour);

int price=icecream.getPrice();
System.out.println("updating get price ="+price);

Colors color=icecream.getColors();
System.out.println("UPDATING COLOR="+color);

PackagingType pack=icecream.getPackagingType();
System.out.println("UPDATING ="+ pack);

String company=icecream.getCompany();
System.out.println(company);

System.out.println("updating INSTANCES ");

IceCream icecream1=new IceCream();
System.out.println("=========UPDATING FLAVOUR PROPERITIES=======");

icecream1.updateFlavour();

icecream1.updateFlavour(Flavour.CHOCOBAR);

System.out.println("=========COST PROPERITIES============");

icecream1.updateCost();

icecream1.updateCost(10000);

System.out.println("updating color properities");

icecream1.updateColors();

icecream1.updateColors(Colors.WHITE);

System.out.println("=========PACKING TYPE======");

icecream1.updatePackagingType();

icecream1.updatePackagingType(PackagingType.ONLINE);

System.out.println("===========company details=====");
icecream1.updateCompany();

icecream1.updateCompany("SUNRISE");


System.out.println("**********UPDATING get methods by using1Instance variables********************");

String flavour1=icecream1.getFlavour();
System.out.println("UPDATING FLAVOUR="+flavour1);

int pric=icecream1.getPrice();
System.out.println("updating get price ="+pric);

Colors colo=icecream1.getColors();
System.out.println("UPDATING COLOR="+colo);

PackagingType pk=icecream1.getPackagingType();
System.out.println("UPDATING ="+ pk);

String compny=icecream1.getCompany();
System.out.println(compny);

IceCream icecream2=new IceCream();
System.out.println("=========UPDATING FLAVOUR PROPERITIES=======");

icecream2.updateFlavour();

icecream2.updateFlavour(Flavour.CHOCOBAR);

System.out.println("=========COST PROPERITIES============");

icecream2.updateCost();

icecream1.updateCost(10000);

System.out.println("updating color properities");

icecream2.updateColors();

icecream2.updateColors(Colors.WHITE);

System.out.println("=========PACKING TYPE======");

icecream2.updatePackagingType();

icecream2.updatePackagingType(PackagingType.ONLINE);

System.out.println("===========company details=====");
icecream2.updateCompany();

icecream2.updateCompany("SUNRISE");


System.out.println("**********UPDATING get methods by using 2Instance variables******************");

String flavor2=icecream1.getFlavour();
System.out.println("UPDATING FLAVOUR="+flavor2);

int price2=icecream1.getPrice();
System.out.println("updating get price ="+price2);

Colors color2=icecream1.getColors();
System.out.println("UPDATING COLOR="+color2);

PackagingType pk2=icecream1.getPackagingType();
System.out.println("UPDATING ="+ pk2);

String compny2=icecream1.getCompany();
System.out.println(compny2);

IceCream icecream3=new IceCream();
System.out.println("=========UPDATING FLAVOUR PROPERITIES=======");

icecream3.updateFlavour();

icecream3.updateFlavour(Flavour.CHOCOBAR);

System.out.println("=========COST PROPERITIES============");

icecream3.updateCost();

icecream3.updateCost(10000);

System.out.println("updating color properities");

icecream3.updateColors();

icecream3.updateColors(Colors.WHITE);

System.out.println("=========PACKING TYPE======");

icecream3.updatePackagingType();

icecream3.updatePackagingType(PackagingType.ONLINE);

System.out.println("===========company details=====");
icecream3.updateCompany();

icecream3.updateCompany("SUNRISE");


System.out.println("**********UPDATING get methods by using3Instance variables******************");

String flavor3=icecream1.getFlavour();
System.out.println("UPDATING FLAVOUR="+flavor3);

int price3=icecream1.getPrice();
System.out.println("updating get price ="+price3);

Colors color3=icecream1.getColors();
System.out.println("UPDATING COLOR="+color3);

PackagingType pk3=icecream1.getPackagingType();
System.out.println("UPDATING ="+ pk3);

String compny3=icecream1.getCompany();
System.out.println(compny3);



}


}