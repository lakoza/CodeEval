package com.anneke.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StackImplementation {

    public static void main(String[] args) throws IOException {

        //File file = new File(args[0]);
        File file = new File("C:\\Users\\anneke\\Desktop\\test1.txt");

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] numbers = line.split(" ");
            int size = numbers.length;
            Stack stack = new Stack(size);
            for (int i = 0; i < size; i++) {
                stack.pop(numbers[i]);
            }
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    System.out.print(stack.push() + " ");
                } else {
                    stack.push();
                }
            }
            System.out.println();

        }
    }

    public static class Stack {

        private int size = 0;
        private String[] array;

        public Stack(int size) {
            this.array = new String[size];
        }

        public void pop(String element) {
            array[size++] = element;
        }

        public String push() {
            String element = array[--size];
            array[size] = null;
            return element;
        }
    }
}
