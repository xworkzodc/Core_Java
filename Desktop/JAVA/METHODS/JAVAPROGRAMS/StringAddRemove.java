import java.util.Scanner;
class StringAddRemove{

public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a word or sentence:");
       String str = in.nextLine();
       
       str += " "; 
       String word = "", lengthWord = "";
       int len = str.length();
       
       for (int i = 0; i < len; i++) {
           char ch = str.charAt(i);
           if (ch == ' ') {
               
                if (word.length() > lengthWord.length())
                    lengthWord = word;
                    
                word = "";
           }
           else {
               word += ch;
           }
       }
       
       System.out.println("The longest word: " + lengthWord +
        ": The length of the word: " + lengthWord.length());
    }
}