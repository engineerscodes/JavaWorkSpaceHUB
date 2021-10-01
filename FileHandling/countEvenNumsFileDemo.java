package com.jayan;

import java.io.*;
import java.util.*;

public class countEvenNumsFileDemo {
    public static void main(String[] args)
    {
        String pathToFile;
        pathToFile = "set-path-file.txt";

        int countWords = 0;

        try
        {
            File file = new File(pathToFile);
            Scanner scanner = new Scanner(file);
            int value = scanner.nextInt();

            while (scanner.hasNext())
            {

                System.out.print(value + " ");

                if (value % 2 == 0)
                    countWords ++;

                value = scanner.nextInt();
                
            }
            System.out.println("WORDS: " + countWords);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No file found:" );
        }
}
}