class SoapStarter{
public static void main(String[] args){
Soap soap=new Soap();
soap.about();
soap.updateName();
soap.updateName("MYSORE SANDAL");
soap.updatePrice();
soap.updatePrice(200);
soap.updateColorrs();
soap.updateColorrs(Colorrs.RED);
soap.updateSize();
soap.updateSize(123456);
soap.updateWeight();
soap.updateWeight(123);
soap.updatemanFacDate();
soap.updateBoolean();
soap.updateBoolean(false);

System.out.println("7 get methods to return the address of the instance variables.");

String soapp=soap.getName();
System.out.println(soapp);

double price1=soap.getPrice();
System.out.println(price1);

Colorrs colors1=soap.getColorrs();
System.out.println(colors1);

int size1=soap.getSize();
System.out.println(size1);


float weight1=soap.getWeight();
System.out.println(weight1);


int manfacdate=soap.getmanFacDate();
System.out.println(manfacdate);

boolean tmf=soap.getTmf();
System.out.println(tmf);

System.out.println("==================updating 1st instances ====================");

Soap soap1=new Soap();
soap.about();
soap.updateName();
soap.updateName("MYSORE SPECIAL");
soap.updatePrice();
soap.updatePrice(300);
soap.updateColorrs();
soap.updateColorrs(Colorrs.WHITE);
soap.updateSize();
soap.updateSize(123);
soap.updateWeight();
soap.updateWeight(12);
soap.updatemanFacDate();
soap.updateBoolean();
soap.updateBoolean(true);

System.out.println("========UPDATING 1ST GET METHODS AND RETURN THE VALUEES ==============");

String sopp=soap.getName();
System.out.println(sopp);

double prce1=soap.getPrice();
System.out.println(prce1);

Colorrs colrs1=soap.getColorrs();
System.out.println(colrs1);

int sze1=soap.getSize();
System.out.println(sze1);


float weght1=soap.getWeight();
System.out.println(weght1);


int manfcdate=soap.getmanFacDate();
System.out.println(manfcdate);

boolean tmf1=soap.getTmf();
System.out.println(tmf1);


System.out.println("==================updating 2st instances ====================");

Soap soap2=new Soap();
soap.about();
soap.updateName();
soap.updateName("COOL SANTOOR REALXING SOAP");
soap.updatePrice();
soap.updatePrice(3000);
soap.updateColorrs();
soap.updateColorrs(Colorrs.RED);
soap.updateSize();
soap.updateSize(12345);
soap.updateWeight();
soap.updateWeight(1111);
soap.updatemanFacDate();
soap.updateBoolean();
soap.updateBoolean(false);

System.out.println("========UPDATING 2ST GET METHODS AND RETURN THE VALUEES ==============");

String spp=soap.getName();
System.out.println(spp);

double prc1=soap.getPrice();
System.out.println(prc1);

Colorrs clrs1=soap.getColorrs();
System.out.println(clrs1);

int sz1=soap.getSize();
System.out.println(sz1);


float weht1=soap.getWeight();
System.out.println(weht1);


int mnfcdate=soap.getmanFacDate();
System.out.println(mnfcdate);

boolean tmf2=soap.getTmf();
System.out.println(tmf2);



System.out.println("==================updating 3st instances ====================");

Soap soap3=new Soap();
soap.about();
soap.updateName();
soap.updateName("SANTOOR SOAP");
soap.updatePrice();
soap.updatePrice(300);
soap.updateColorrs();
soap.updateColorrs(Colorrs.RED);
soap.updateSize();
soap.updateSize(1245);
soap.updateWeight();
soap.updateWeight(111);
soap.updatemanFacDate();
soap.updateBoolean();
soap.updateBoolean(true);

System.out.println("========UPDATING 3ST GET METHODS AND RETURN THE VALUEES ==============");

String soap33=soap.getName();
System.out.println(soap33);

double price3=soap.getPrice();
System.out.println(price3);

Colorrs color3=soap.getColorrs();
System.out.println(color3);

int size3=soap.getSize();
System.out.println(size3);


float weight3=soap.getWeight();
System.out.println(weight3);


int mnfcdate3=soap.getmanFacDate();
System.out.println(mnfcdate3);

boolean tmf3=soap.getTmf();
System.out.println(tmf3);





























}





}