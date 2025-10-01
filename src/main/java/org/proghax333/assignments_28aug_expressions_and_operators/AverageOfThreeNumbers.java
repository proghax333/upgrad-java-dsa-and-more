package org.proghax333.assignments_28aug_expressions_and_operators;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Average of three calculator]\n");

        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double number3 = scanner.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("Average of " + number1 + ", " + number2 + ", " + number3 + " is = " + average);

        scanner.close();
    }
}
