package org.proghax333.test30aug;

import java.util.Scanner;

public class SwapUsingTemporaryVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number (b): ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("[ Swapping Completed ]");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        scanner.close();
    }
}
