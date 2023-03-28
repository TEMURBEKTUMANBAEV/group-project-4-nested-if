package com.devxschool.student;

import com.devxschool.test.Validation;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        /**
         *
         *  Write a Java program that takes a single character from the alphabet and
         *  Print Vowel or Consonant, depending on the user input.
         *  If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
         *  Hint:
         *  lowercase letters are between 97 and 122 char
         *
         *  Example output:
         * Input an alphabet:
         * p
         * Input letter is Consonant
         *
         */

        System.out.println("Input an alphabet: ");
        Scanner input = new Scanner(System.in);
        String enteredString = input.next();
        // checks whether an input has 1 letter
        if (enteredString.length() > 1) {
            System.out.println("Input length is longer than 1");
            System.exit(0);
        }
        // converts String to lower case char
        char toChar = enteredString.toLowerCase().charAt(0);
        if (!Character.isLetter(toChar)) {
            System.out.println("Error: Please enter an alphabet.");
            System.exit(0);
        }

        // checks if char is numeric or alphabetic
        if (Character.isAlphabetic(toChar)) {
            // TODO write your code here
            String result = "";
            if (toChar == 'a' || toChar == 'e' || toChar == 'i' || toChar == 'o' || toChar == 'u') {
                result = "Vowel";
            } else {
                result = "Consonant";
            }

            System.out.println("Input letter is " + result);
        }

    }
}
