class StringLastIndex{


public static void main(String[] args){

String str="VIGNESH BEST SWIMMER STATE BRONZE MEDALIST";

String str1="VIGNESH BEST SWIMMER BRONZE MEDALIST";
int strLastIndex=0;
int str1FirstIndex=0;

System.out.println("String"+str);

strLastIndex=str.lastIndexOf('i');
str1FirstIndex=str1.firstIndexOf('i');
System.out.println("printing the last occurence element of the string "+strLastIndex);
System.out.println("printing the first occurence element of the string "+str1FirstIndex);

}




}