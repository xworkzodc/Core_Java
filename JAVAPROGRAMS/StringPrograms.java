class StringPrograms{

public static void main(String[] args){

int count=0;
String s="@ SOFTWARE DEVELOPER";


for(int i=0;i<s.length();i++)
{
	if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) 
	count++;
}

if(count==0)
{
	System.out.println("NO OTHER SPECIAL CHARECTERS FOUND");
}

else
{
	System.out.println("String has special charecters\n"+count+"Special charecters found");
}




}
}

// if (!Character.isDigit(s.charAt(i))
  //              && !Character.isLetter(s.charAt(i))
   //             && !Character.isWhitespace(s.charAt(i))) 
