//// 5 times 
// litera and new 
// ==
//isEmpty(),toLowerCase();toUpperCase();length();replaceAll(String,String);trim();startsWith(String);endsWith(String);
// substring(int);substring(int,int);concat(String);



class StringTester1
{

public static void main(String[] args){
String name="VIGNESH";

String name1="arjun";

System.out.println(name);
System.out.println(name1);

String string=new String("Vignesh");

String string1=new String("PRABHAS");

System.out.println(string);
System.out.println(string1);

name="RAM CHARAN";
System.out.println(name);

name1="ram charan";
System.out.println(name1);

String str=new String("DORA SRI VIGNESH THE SOFTWARE DEVELOPER");
System.out.println(str.substring(10));

System.out.println("===========ISEMPTY==============");

boolean nam=name.isEmpty();
System.out.println(nam);

boolean nm=name1.isEmpty();
System.out.println(nm);

String darling="";
boolean daling=darling.isEmpty();
System.out.println(daling);

name=name.toUpperCase();
System.out.println(name);

name1=name1.toUpperCase();
System.out.println(name1);

name=name.toLowerCase();
System.out.println(name);

name1=name1.toLowerCase();
System.out.println(name1);

int len=name.length();
System.out.println(len);

int length=name1.length();
System.out.println(length);

int length1=string.length();
System.out.println(length1);

int length2=string1.length();
System.out.println(length2);


name=name.trim();
System.out.println(name);

name1=name1.trim();
System.out.println(name1);

name=name.replaceAll("r","R");
System.out.println(name);

name1=name1.replaceAll("a","A");
System.out.println(name1);

string=string.replaceAll("V","v");
System.out.println(string);

string1=string1.replaceAll("a","A");
System.out.println(string);

string1=string1.replaceAll("P","p");
System.out.println(string1);

string1=string1.replaceAll("R","r");
System.out.println(string1);

string1=string1.replaceAll("A","a");
System.out.println(string1);

boolean st=string1.startsWith("PR");
System.out.println(st);

boolean st1=string1.startsWith("P");
System.out.println(st1);

boolean st2=string1.endsWith("S");
System.out.println(st2);

boolean st3=string1.startsWith("");
System.out.println(st3);

String string5=new String("XWORKZ IS THE BEST SOFTWARE TRAINING INSTUIUTE IN INDIA");
System.out.println(string5.substring(10));

String string6=new String("XWORKZ IS THE BEST SOFTWARE TRAINING INSTUIUTE IN INDIA");
System.out.println(string5.substring(6));

String string7=new String("XWORKZ IS THE BEST SOFTWARE TRAINING INSTUIUTE IN INDIA");
System.out.println(string7.substring(0));

String string8=new String("XWORKZ IS THE BEST SOFTWARE TRAINING INSTUIUTE IN INDIA");
System.out.println(string8.substring(0,1));
System.out.println(string8.substring(10,11));

System.out.println(string8.substring(20,30));

name=name.concat("BEST DANCE");
System.out.println(name);

String name5="VIGNESH";
name5=name5.concat("the best swimmer in the world");
System.out.println(name5);





















}







}