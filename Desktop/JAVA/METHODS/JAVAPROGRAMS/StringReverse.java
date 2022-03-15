class StringReverse{

public static void main(String[] args){
	
	String string="MOM MY LOVE";
	String revString=" ";
	
	for(int  i=string.length()-1;i>=0;i--)
		
	revString=revString+string.charAt(i);
	
	System.out.println("ORIGINAL STRING =" +string);
	System.out.println("revString ="+revString);
	
}



}