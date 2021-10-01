package com.jayan;

import java.io.*;
import java.util.*;

public class PrintWriterDemo {
    public static void main(String[] args) 
    throws IOException {

    String pathToFile;
    pathToFile = "set-path-file.txt";

    File file = new File(pathToFile);
    PrintWriter printWriter = new PrintWriter(file);

    printWriter.print("Hello");
    printWriter.println("Java");
    printWriter.println(123);
    printWriter.printf("You have %d %s", 400, "gold coins");

    printWriter.close();

    }

        // File file = new File("/Users/jayanpraveen/Desktop/hello-world/printwriter.txt");
        // try(
        // PrintWriter printWriter = new PrintWriter(file))
        // {
        //     printWriter.print("Hello"); // prints a string
        //     printWriter.println("Java"); // prints a string and then terminates the line
        //     printWriter.println(123); // prints a number
        //     printWriter.printf("You have %d %s", 400, "gold coins"); // prints a formatted string
        // }catch(
        // IOException e)
        // {
        //     System.out.printf("An exception occurs %s", e.getMessage());
        // }
    
}