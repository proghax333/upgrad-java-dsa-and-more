package org.proghax333.assignments_02sept;

import java.util.Scanner;

public class TemperatureConversionApp {
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
