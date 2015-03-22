package com.anneke.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RemoveCharacters {

      public static void main(String[] args) throws IOException {

        //File file = new File(args[0]);
        File file = new File("C:\\Users\\anneke\\Desktop\\test1.txt");

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] nodes = line.split(",");
            String source = nodes[0].trim();
            char[] toDelete = nodes[1].trim().toCharArray();
            String result = source;
            for ( char charToDelete : toDelete ){
                result = result.replaceAll(String.valueOf(charToDelete), "");
            }
            System.out.println(result);
        }
    }

  
}
