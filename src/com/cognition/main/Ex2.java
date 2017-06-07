package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/7/17.
 *
 * 2. Write a program that asks the user for a number n and gives him the possibility to choose between computing the sum and computing the product of 1,…,n.
 */
public class Ex2 {
    private static int sum = 0;
    private static int product = 1;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\n*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("\nWrite a program that asks the user for a number n and gives him the possibility to choose between computing the sum and computing the product of 1,…,n.");
        System.out.println("\n\tInput number n");
        System.out.print("\n\t");
        int n = input.nextInt();
        choose(n);
    }

    private static void choose(int n) {
        System.out.println("\tAdd or Multiply?\t[A\\M]");
        System.out.print("\t");
        String action = input.next();
        action = action.toUpperCase();
        switch (action){
            case "A":
                for (int i = n; i > 0; i--) {
                    sum += i;
                }

                System.out.println("\tThe sum is: " + sum);
                break;

            case "M":
                for (int i = n; i > 0; i--) {
                    product *= i;
                }

                System.out.println("\tThe product is: " + product);
                break;

            default:
                System.out.println("\nInvalid choice");
                choose(n);
                break;
        }
    }
}
