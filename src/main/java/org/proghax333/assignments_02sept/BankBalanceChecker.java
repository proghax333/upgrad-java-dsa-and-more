package org.proghax333.assignments_02sept;

import java.util.Scanner;

public class BankBalanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your balance: ");
        double balance = scanner.nextDouble();

        if(balance > 0) {
            System.out.println("You have positive balance.");
        } else if(balance == 0.0) {
            System.out.println("You have zero balance.");
        } else {
            System.out.println("You have negative balance. Account is overdrawn.");
        }

        scanner.close();
    }
}
