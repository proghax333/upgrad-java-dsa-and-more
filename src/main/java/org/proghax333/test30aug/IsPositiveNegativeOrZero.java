package org.proghax333.test30aug;

import java.util.Scanner;

public class IsPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number > 0) {
            System.out.println(number + " is positive.");
        } else if(number == 0) {
            System.out.println(number + " is zero.");
        } else {
            System.out.println(number + " is negative.");
        }

        scanner.close();
    }
}
