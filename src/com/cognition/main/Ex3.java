package com.cognition.main;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by robin on 6/7/17.
 *
 * 3. Write a function that returns the largest element in an array
 */
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("\n\n*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("\nWrite a function that returns the largest element in an array");
        int[] set = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            set[i] = rand.nextInt(100);
        }
        System.out.println("\nA randomly generated array to be used: " + Arrays.toString(set));

        int max = set[0];
        for (int aSet : set) {
            if (aSet > max){
                max = aSet;
            }
        }

        System.out.println("\nLargest element: " + max);
    }

}
