package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/7/17.
 *
 * 1. Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
 */

public class Ex1 {
    public static void main(String[] args){
        int n, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("\nWrite a program that asks the user for a number n and prints the sum of the numbers 1 to n");
        System.out.println("\n\tInput number n");
        System.out.print("\t");
        n = input.nextInt();

        for (int i = n; i > 0; i--){
            sum += i;
        }

        System.out.println("\tThe sum is: " + sum);
    }
}
