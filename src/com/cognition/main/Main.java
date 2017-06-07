package com.cognition.main;

import java.util.Scanner;

/**
 * Created by robin on 6/7/17.
 *
 */
public class Main {
    public static void main(String[] args){
        choose();
    }

    private static void choose(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a question\n");
        System.out.println("\t1. Write a program that asks the user for a number n and prints the sum of the numbers 1 to n\n" +
                "\t2. Write a program that asks the user for a number n and gives him the possibility to choose between computing the sum and computing the product of 1,…,n.\n" +
                "\t3. Write a function that returns the largest element in an array\n" +
                "\t4. Write a function that checks whether an element occurs in an array\n" +
                "\t5. Write a program that asks the user for a number n and prints it's factorial using recursion\n" +
                "\t6. Exit");
        System.out.print("\n\t");
        int question = input.nextInt();
        switch (question){
            case 1:
                Ex1.main(null);
                break;

            case 2:
                Ex2.main(null);
                break;

            case 3:
                Ex3.main(null);
                break;

            case 4:
                Ex4.main(null);
                break;

            case 5:
                Ex5.main(null);
                break;

            case 6:
                break;

            default:
                System.out.println("\nInvalid choice");
                choose();
                break;
        }
    }
}
