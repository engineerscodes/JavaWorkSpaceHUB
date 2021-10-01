package com.jayan;

import java.io.IOException;
import java.nio.file.*;
// import java.nio.file.Paths;

public class readFileDemo
{
    public static String readFileAsString(String fileName) throws IOException
    {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args)
    {
        String pathToHelloWorldJava = "set-path-file.txt";
        try
        {
            System.out.println(readFileAsString(pathToHelloWorldJava));
            
        }
        catch (IOException e)
        {
            System.out.println("Cannot read file: " + e.getMessage());
        }
    }
}