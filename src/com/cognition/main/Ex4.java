package com.cognition.main;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by robin on 6/7/17.
 *
 * 4. Write a function that checks whether an element occurs in an array
 */
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("\n\n*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("\nWrite a function that checks whether an element occurs in an array");
        int[] set = new int[10];
        Random rand = new Random();
        int check = rand.nextInt(100);
        for (int i = 0; i < 10; i++){
            set[i] = rand.nextInt(100);
        }
        System.out.println("\nA randomly generated array to be used: " + Arrays.toString(set));
        System.out.println("A randomly generated value to check: " + check);

        boolean found = false;
        for (int aSet : set) {
            if (aSet == check){
                found = true;
            }
        }

        if (found){
            System.out.println("Value Found");
        }else{
            System.out.println("Value Not Found");
        }
    }
}
