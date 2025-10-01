package org.proghax333.test30aug;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n[ Simple Interest Calculator ]\n\n");

        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rateOfInterest = scanner.nextDouble();

        System.out.println("Enter the time duration: ");
        double timeDuration = scanner.nextDouble();

        double simpleInterest = (principal * rateOfInterest * timeDuration) / 100.0;

        System.out.println("The simple interest is = " + simpleInterest);

        scanner.close();
    }
}
