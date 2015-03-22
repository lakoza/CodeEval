package com.anneke.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestLines {

    public static void main(String[] args) throws IOException {

        //File file = new File(args[0]);
        File file = new File("C:\\Users\\anneke\\Desktop\\test.txt");

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        int count = 0;
        //Map lines = new HashMap();
        List lines = new ArrayList();
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
        
            if (count == 0) {
                count = Integer.parseInt(line);
                System.out.println(count);
                continue;
            }

            int length = line.length();
            if ( length == 0 ) continue;
            Line l = new Line(length, line);
            lines.add(l);

        }
        Collections.sort(lines);

        for (int i = 0; i < count; i++) {
            System.out.println(lines.get(i));
        }
    }

    private static class Line implements Comparable<Line> {

        public int length;
        public String line;

        public Line(int length, String line) {
            this.length = length;
            this.line = line;
        }

        @Override
        public int compareTo(Line that) {
            if (that == null) {
                throw new NullPointerException();
            }

            if (this.length > that.length) {
                return -1;
            }
            if (this.length < that.length) {
                return 1;
            }
            return 0;
        }

        @Override
        public String toString() {
            return line;
        }
    }
}
