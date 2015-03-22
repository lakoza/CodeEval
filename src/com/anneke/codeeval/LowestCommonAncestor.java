package com.anneke.codeeval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

    // store tree as:
    // starting from head
    // left:  i*2 + 1
    // right: i*2 + 2
    private static int[] tree = {30, 8, 52, 3, 20, 0, 0, 0, 0, 10, 29};

    public static void main(String[] args) throws IOException {

        //File file = new File(args[0]);
        File file = new File("C:\\Users\\anneke\\Desktop\\test.txt");

        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] nodes = line.split(" ");
            int one = Integer.parseInt(nodes[0]);
            int two = Integer.parseInt(nodes[1]);
            int lowest = find(one, two);
            System.out.println(lowest);
        }
    }

    private static int find(int one, int two) {
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();

        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == one) {
                ones = findParents(i);
            }
            if (tree[i] == two) {
                twos = findParents(i);
            }
        }
        System.out.println(ones);
        System.out.println(twos);
        
        for ( Integer o : ones ){
            for ( Integer t : twos ){
                if ( o == t ) return o;
            }
        }
        return -1;
    }

    private static List findParents(int childIndex) {
        List parents = new ArrayList();
            
        while ( childIndex !=0 ){
            parents.add(tree[childIndex]);
            childIndex = (childIndex - 1)/2;
        }
        parents.add(tree[0]);
        return parents;
    }

}
