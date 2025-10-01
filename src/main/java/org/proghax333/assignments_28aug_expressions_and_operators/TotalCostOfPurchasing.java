package org.proghax333.assignments_28aug_expressions_and_operators;

import java.util.Scanner;

public class TotalCostOfPurchasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity of the item: ");
        int quantity = scanner.nextInt();

        System.out.println("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalCost = quantity * pricePerItem;
        System.out.println("Total cost = " + totalCost);

        scanner.close();
    }
}
