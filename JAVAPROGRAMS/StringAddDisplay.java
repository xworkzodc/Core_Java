//Write a Program to add and display movie names. Should add least 20 names
//Should add a movie name , if name is min 2 chars , and no special char except space and max of 40 chars 

class StringAddDisplay{

String[] names=new String[20];
int tempIndex=0;

void addName(String name)
{

System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);
System.out.println("Adding String Names="+name);

this.names[tempIndex]=name;
tempIndex++;

}

void displayNames()
{

System.out.println("Displaying the string names");

for(int n=0;n<names.length;n++)
{

String name=this.names[n];
System.out.println(name);

}

}








}