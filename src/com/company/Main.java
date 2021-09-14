/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int item_total;
        float sum = 0;

        for (int i = 0; i < 3; i++){
            System.out.printf("Enter the price of item %d: ", i+1);
            int price = input.nextInt();

            System.out.printf("Enter the quantity of item %d: ", i+1);
            int quantity = input.nextInt();
            item_total = price * quantity;

            sum+= item_total;

        }
        double tax;
        tax = sum*0.0055;
        double total = sum + tax;
        System.out.printf("Subtotal: $%.2f)\n",sum);

        System.out.printf("Tax: $%.2f\n", tax);

        System.out.printf("Total: $%.2f\n", total);
    }
}