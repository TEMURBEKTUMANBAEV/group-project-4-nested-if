package com.devxschool.student;

import com.devxschool.test.Validation;

import java.text.DecimalFormat;
import java.util.Scanner;

import static com.devxschool.test.Validation.testBill;

public class JoliesRestaurant {
    public static void main(String[] args) {
        /**
         *
         * Write a check to a customer based on their input
         * - how many people?
         * - what is the total amount?
         *      * automatically add 10% tax fee
         * - provide check together or split?
         *      * split - divide amount per person
         *      * together - one total amount for all
         * - how was the restaurant's service?
         *      * bad - 10%
         *      * ok - 15%
         *      * good - 20%
         *      * perfect - 25%
         *
         *
         * example output:
         * out: Welcome to Jolie's Restaurant!!!
         * out: Enter number of guests:
         *  in: 5
         * out: Enter a restaurant bill amount:
         *  in: 200
         * out: Is your check split?
         *  in: true
         * out: How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)
         *  in: perfect
         * out: Number of guests: 5
         * out: Total amount: $275.0
         * out: Total per guest: $55.0
         */

        Scanner scanner = new Scanner(System.in);
        int numberOfGuests = 0;
        double billAmount = 0;
        double taxFee = 0;
        boolean isSplit = false;
        String serviceQuality = "";
        double totalAmount = 0;
        double totalAmountPerGuest = 0;

        //TODO write your code here
        System.out.println("Welcome to Jolie's Restaurant!!!");

        System.out.println("Enter number of guests:");
        numberOfGuests = scanner.nextInt();

        System.out.println("Enter a restaurant bill amount:");
        billAmount = scanner.nextDouble();
        taxFee = billAmount * 0.1;

        System.out.println("Is your check split? (true/false):");
        isSplit = scanner.nextBoolean();

        System.out.println("How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%):");
        serviceQuality = scanner.next();

        if (serviceQuality.equals("bad")) {
            totalAmount = billAmount + taxFee + (billAmount * 0.1);
        } else if (serviceQuality.equals("ok")) {
            totalAmount = billAmount + taxFee + (billAmount * 0.15);
        } else if (serviceQuality.equals("good")) {
            totalAmount = billAmount + taxFee + (billAmount * 0.2);
        } else if (serviceQuality.equals("perfect")) {
            totalAmount = billAmount + taxFee + (billAmount * 0.25);
        } else {
            System.out.println("Invalid service quality entered.");
        }

        if (isSplit) {
            totalAmountPerGuest = totalAmount / numberOfGuests;
        } else {
            totalAmountPerGuest = totalAmount;
        }

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Total amount: $" + df.format(totalAmount));
        System.out.println("Total per guest: $" + df.format(totalAmountPerGuest));
    }
}
