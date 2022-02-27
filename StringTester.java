class StringTester{

public static void main(String [] args){

String flower="ROSE";

System.out.println(flower);

String flower1=new String("RED");
System.out.println(flower1);

if(flower==flower1)
{
	System.out.println("both strings are same");
	
}
else
{
	System.out.println("both strings are not same");
}

flower=flower1;
System.out.println(flower);
System.out.println(flower1);

flower1="reder";
System.out.println(flower1);

flower="darling";
System.out.println(flower);

flower=flower1;

System.out.println(flower1);

System.out.println(flower);

boolean flo=flower.isEmpty();
System.out.println(flo);

boolean flow=flower1.isEmpty();
System.out.println(flow);


String movie=new String();
boolean et=movie.isEmpty();
System.out.println(et);



String movie2="BHEEMLYA NAYAK";
boolean mov=movie2.isEmpty();
System.out.println(mov);


String movie3="";
boolean movi=movie3.isEmpty();
System.out.println(movi);

flower=flower.toUpperCase();
System.out.println(flower);

flower1=flower1.toUpperCase();
System.out.println(flower1);


flower=flower.toLowerCase();
System.out.println(flower);

flower1=flower1.toLowerCase();
System.out.println(flower1);



//displays the length of the string
int len=flower.length();
System.out.println(len);

int length=flower1.length();
System.out.println(length);

int movie1=movie.length();
System.out.println(movie1);

int moo=movie2.length();
System.out.println(moo);

int mass=movie3.length();
System.out.println(mass);

movie2=movie2.trim();
System.out.println(movie2);

String message="OM NAMO VENKETESAYA";

message=message.trim();
System.out.println(message);

message=message.replaceAll(" "," ");
System.out.println(message);

message=message.replaceAll(" O "," o ");
System.out.println(message);


message=message.replaceAll(" om "," OM ");
System.out.println(message);

boolean check=message.startsWith("OM");
System.out.println(check);

boolean chec=message.startsWith("OMNAMO");
System.out.println(chec);

boolean chekk=movie2.startsWith("BHEEMLYA");
System.out.println(chekk);


boolean cheeck=movie3.endsWith("Nayak");
System.out.println(cheeck);

System.out.println("displaying the substring(int) ");
String str=new String("DORA SRI VIGNESH THE SOFTWARE DEVELOPER");
System.out.println(str.substring(9));

System.out.println("substring(int,int)");

String str1=new String("SRI VIGNESH THE WORLD BEST SWIMMER");
System.out.println(str1.substring(1,2));
System.out.println(str1.substring(0,1));
System.out.println(str1.substring(2,3));

movie2=movie2.concat("mass movie fully entertainment");
System.out.println(movie2);

movie3=movie3.concat("FULLY COMEDY MOVIE");
System.out.println(movie3);

flower=flower.concat("ROSE FLOWER MY FAVOURIT FLOWER");
System.out.println(flower);


flower1=flower1.concat("ROSE FLOWER MY FAVOURIT FLOWER");
System.out.println(flower1);



}





}

