package org.proghax333.assignments_28aug_expressions_and_operators;

import java.util.Scanner;

public class AreaOfTrapezoidCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Area of trapezoid calculator]\n");

        System.out.println("Enter the length of base 1: ");
        double base1 = scanner.nextDouble();

        System.out.println("Enter the length of base 2: ");
        double base2 = scanner.nextDouble();

        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        double areaOfTrapezoid = (base1 + base2) / 2 * height;
        System.out.println("Area of trapezoid = " + areaOfTrapezoid);

        scanner.close();
    }
}
