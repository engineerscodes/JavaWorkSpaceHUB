package com.jayan;

import java.io.*;
import java.util.*;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String pathToFile;
        pathToFile = "/Users/jayanpraveen/Desktop/hello-world/FILE_NAME.txt";

        File file = new File(pathToFile);
        FileWriter writer = new FileWriter(file, true); 

        writer.write("Hello\n");
        writer.write("Java\n");

        writer.close();
    }
}