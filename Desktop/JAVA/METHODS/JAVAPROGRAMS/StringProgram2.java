class StringProgram2{



public static void printMiddleCharecter(String str)
{
	int len=str.length();//FINDING THE STRING OF THE LENGTH
	
	int middle=len/2; //FINDING MIDDLE INDEX OF THE STRING
	
	System.out.println(str.charAt(middle));
	
	
}


public static void main(String[] args){
	
	String str="VIGNESH THE SOFTWARE DEVELOPER";
	
	printMiddleCharecter(str);






}



}