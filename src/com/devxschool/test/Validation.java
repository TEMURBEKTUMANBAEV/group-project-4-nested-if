package com.devxschool.test;

public class Validation {
    public static void testBill(int numberOfGuests, double billAmount, boolean isSplit, String serviceQuality, double totalAmount, double totalAmountPerGuest) throws RuntimeException {

        double totalAmountTest = billAmount + (billAmount * 0.1);

        if (serviceQuality.equals("bad")) {
            totalAmountTest += totalAmountTest * 0.1;
        } else if (serviceQuality.equals("ok")) {
            totalAmountTest += totalAmountTest * 0.15;
        } else if (serviceQuality.equals("good")) {
            totalAmountTest += totalAmountTest * 0.2;
        } else if (serviceQuality.equals("perfect")) {
            totalAmountTest += totalAmountTest * 0.25;
        }
        if (totalAmountTest != totalAmount) {
            System.out.println("Total \nActual: " + totalAmount);
            System.out.println("Expected: " + totalAmountTest);
            throw new RuntimeException("Your result is incorrect!!!");

        }
        if (isSplit) {
            totalAmountTest /= numberOfGuests;
            if (totalAmountTest != totalAmountPerGuest) {
                System.out.println("Per guest \nActual: " + totalAmountPerGuest);
                System.out.println("Expected: " + totalAmountTest);
                throw new RuntimeException("Your result is incorrect!!!");
            }
        }

    }

    public static void testAlphabet(char toChar, String result) {

        if (result.equalsIgnoreCase("vowel")) {
            if (toChar != 'a' && toChar != 'e' && toChar != 'i' && toChar != 'o' && toChar != 'u') {
                throw new RuntimeException("Your output is incorrect");
            }
        } else if (result.equalsIgnoreCase("consonant")) {
            if (toChar < 97 || toChar > 122) {
                throw new RuntimeException("Your output is incorrect");
            }
        } else {
            throw new RuntimeException("Input should be a letter");
        }


    }

    public static void testVehicle(int vehicleYear, String result) {
        String notOk = "Your vehicle needs to be recalled!";
        String ok = "Your vehicle is fine, enjoy!";
        if (!result.equalsIgnoreCase(notOk) && !result.equalsIgnoreCase(ok)) {
            throw new RuntimeException("expected results:\n" + notOk + "\n" + ok);
        }

        if (result.equalsIgnoreCase(notOk)) {
            if ((vehicleYear < 2001 || vehicleYear > 2002)
                    && (vehicleYear < 2004 || vehicleYear > 2006)
                    && (vehicleYear < 2015 || vehicleYear > 2017)) {
                throw new RuntimeException("\nexpected: " + notOk + "\nactual: " + result);
            }
        } else {
            if (vehicleYear >= 2001 && vehicleYear <= 2002
                    || vehicleYear >= 2004 && vehicleYear <= 2006
                    || vehicleYear >= 2015 && vehicleYear <= 2017) {
                throw new RuntimeException("\nexpected: " + ok + "\nactual: " + result);
            }
        }

    }

    public static void testDaycare(double age, boolean agreement, String childClass) {
        if (agreement) {
            if (childClass.isEmpty() || childClass.isEmpty()) {
                throw new RuntimeException("Check class name. Should be one of {Star, Sun}");
            }
            if (childClass.equalsIgnoreCase("Star") && (age >= 3 || age < 1.5)) {
                throw new RuntimeException("Star class should be between 1.5 and 3");
            }
            if (childClass.equalsIgnoreCase("Sun") && (age < 3 || age > 6)) {
                throw new RuntimeException("Sun class should be between 3 and 6");
            }
        } else {
            if (childClass != null) {
                throw new RuntimeException("Child should not have any class");
            }
        }

    }
}
