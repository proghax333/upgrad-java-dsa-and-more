package org.proghax333.assignments_28aug_expressions_and_operators;

import java.util.Scanner;

public class ReverseAThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a three digit number: ");
        int n = scanner.nextInt();

        // skipping validation of n (checks to ensure it is a 3 digit number)
        int firstDigit = n % 10;
        int secondDigit = (n / 10) % 10;
        int thirdDigit = (n / 100) % 10;

        int reversedN = thirdDigit + secondDigit * 10 + firstDigit * 100;
        System.out.println("Reversed number: " + reversedN);

        scanner.close();
    }
}
