package org.proghax333.test30aug;

import java.util.Scanner;

public class LargestAmongstThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.println("Enter the third number: ");
        double c = scanner.nextDouble();

        double largest = a;
        if(b > largest) {
            largest = b;
        }
        if(c > largest) {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
