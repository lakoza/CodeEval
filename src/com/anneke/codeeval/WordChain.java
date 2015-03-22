package com.anneke.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WordChain {
      public static void main(String[] args) throws IOException {

        //File file = new File(args[0]);
        File file = new File("C:\\Users\\anneke\\Desktop\\test1.txt");

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] words = line.split(",");
            int size = words.length;
            //char [] first = new char[size];
            //List last = new ArrayList();
            List list = Arrays.asList(words);
            Iterator it = list.iterator();
            while ( it.hasNext() ){
                String word = it.next().toString();
                char last = word.charAt(word.length()-1);
                
            }
            for ( int i=0; i<size; i++  ){
                String word = words[i];
                first[i] = word.charAt(0);
                last.add(word.charAt(word.length()-1));
            }
            
            
            if ( count == 0 ) {
                System.out.println("None");
            } else {
                count++;
                System.out.println(count);
            }
        }
    }

}
