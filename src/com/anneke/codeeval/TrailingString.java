package com.anneke.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TrailingString {

    public static void main(String[] args) throws IOException {

        //File file = new File(args[0]);
        File file = new File("C:\\Users\\anneke\\Desktop\\test1.txt");

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }
            String[] strings = line.split(",");
            String first = strings[0];
            String second = strings[1];
            if (first.endsWith(second)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
