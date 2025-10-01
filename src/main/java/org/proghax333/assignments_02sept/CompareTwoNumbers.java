package org.proghax333.assignments_02sept;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double n2 = scanner.nextDouble();

        if(n1 > n2) {
            System.out.println(n1 + " is larger than " + n2);
        } else if(n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else {
            System.out.println(n2 + " is larger than " + n1);
        }

        scanner.close();
    }
}
