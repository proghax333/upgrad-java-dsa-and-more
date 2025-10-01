package org.proghax333.assignments_02sept;

import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ Price Calculator ]");

        System.out.println("Enter the price of the product: ");
        double price = scanner.nextDouble();

        System.out.println("Enter the quantity of the product: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println("Total price: " + total);

        scanner.close();
    }
}
