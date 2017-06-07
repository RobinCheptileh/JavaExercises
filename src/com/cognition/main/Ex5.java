package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/7/17.
 *
 * 5. Write a program that asks the user for a number n and prints it's factorial using recursion
 */
public class Ex5 {
    private static int product = 1;
    public static void main(String[] args){
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("\nWrite a program that asks the user for a number n and prints it's factorial using recursion");
        System.out.println("\n\tInput number n");
        System.out.print("\t");
        n = input.nextInt();
        factorial(n);
    }

    private static void factorial(float n){
        if (n == 1){
            System.out.println("\tFactorial: " + product);
        }else {
            product *= n;
            factorial(n - 1);
        }
    }
}