package org.proghax333.assignments_02sept;

import java.util.Scanner;

public class StudentGradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        double marks = scanner.nextDouble();

        if(marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered.");
            scanner.close();
            return;
        }

        if(marks >= 40) {
            System.out.println("You passed.");
        } else {
            System.out.println("You failed.");
        }

        scanner.close();
    }
}
