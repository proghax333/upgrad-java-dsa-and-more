package org.proghax333.assignments_28aug_expressions_and_operators;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[Fahrenheit to Celsius Converter]\n");

        System.out.println("Enter the temperature in fahrenheit: ");
        double f = scanner.nextDouble();

        double c = (f - 32) * 5 / 9;
        System.out.println("Temperature in celsius: " + c);

        scanner.close();
    }
}
