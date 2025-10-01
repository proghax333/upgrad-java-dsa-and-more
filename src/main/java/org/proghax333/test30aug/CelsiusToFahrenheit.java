package org.proghax333.test30aug;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Celsius to Fahrenheit Converter]\n");

        System.out.println("Enter the temperature in celsius: ");
        double c = scanner.nextDouble();

        double f = c * 9 / 5 + 32;
        System.out.println("Temperature in fahrenheit: " + f);

        scanner.close();
    }
}
