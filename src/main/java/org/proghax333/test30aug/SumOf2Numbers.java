package org.proghax333.test30aug;

import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);

        scanner.close();
    }
}
