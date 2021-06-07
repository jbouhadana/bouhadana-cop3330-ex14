/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String amount = jb.nextLine();
        double subtotal = Double.valueOf(amount);

        System.out.print("What is the state? ");
        String state = jb.nextLine();

        double tax = 0;

        if (state.equalsIgnoreCase("WI"))
        {
            tax = 5.5/100;
            System.out.printf("The subtotal is $%.2f.\n", subtotal);
            System.out.printf("The tax is $%.2f\n", tax*subtotal);
        }

        System.out.printf("The total is $%.2f", subtotal + (subtotal*tax));

    }
}
