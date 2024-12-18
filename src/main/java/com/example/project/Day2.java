
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        int good = 0;
        int bad = 0;
        String[] goodKids = new String[names.length];
        String[] badKids = new String[names.length];

        for(int i = 0; i < names.length; i ++) {
            if((int)(Math.random() *2) == 0) {
                goodKids[good] = names[i];
                good++;
    
            }
            else{
                badKids[bad] = names[i];
                bad++;
            } 
            
        }
        String[][] out = new String[2][names.length];
        for(int i = 0; i < good; i++) {
            out[0][i] = goodKids[i];
        }
        for(int i = 0; i < bad; i++) {
            out[1][i] = badKids[i];
        }

        return out; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        String[] names = {"a", "b", "c", "d", "e", "f", "g"};
        String[][] result = nameSort(names);

        // Print the "good" kids
        System.out.print("Good Kids: ");
        for (int i = 0; i < result[0].length; i++) {
            System.out.print(result[0][i] + " ");
        }
        System.out.println();

        // Print the "bad" kids
        System.out.print("Bad Kids: ");
        for (int i = 0; i < result[1].length; i++) {
            System.out.print(result[1][i] + " ");
        }
        System.out.println();
        
    }
}