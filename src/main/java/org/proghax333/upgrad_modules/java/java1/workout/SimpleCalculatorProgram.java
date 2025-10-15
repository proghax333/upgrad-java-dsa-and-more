package org.proghax333.upgrad_modules.java.java1.workout;

import java.util.Scanner;

public class SimpleCalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result of addition: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result of subtraction: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result of multiplication: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.printf("Result of division: %.1f%n", (num1 / num2));
                    else
                        System.out.println("Error: Division by zero is not allowed.");
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes")) {
                System.out.println("\nExiting program...");
                continueCalculation = false;
            }

            System.out.println();
        }

        scanner.close();
    }
}
