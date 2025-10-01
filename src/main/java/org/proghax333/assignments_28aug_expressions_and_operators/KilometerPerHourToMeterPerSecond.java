package org.proghax333.assignments_28aug_expressions_and_operators;

import java.util.Scanner;

public class KilometerPerHourToMeterPerSecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("[Kilometer Per Hour to Meter Per Second]\n");

        System.out.println("Enter the velocity in KPH: ");
        double kph = scanner.nextDouble();

        double mps = kph * 5 / 18;
        System.out.println("Velocity in MPS: " + mps);

        scanner.close();
    }
}
