package com.xworkz.exceptions;

import java.io.FileWriter;
import java.io.IOException;


public class TextFileWritingExample {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write("Hello vignesh how are u ");
            writer.write("\r\n");   // write new line
            writer.write("i like ur dancing my friend");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}