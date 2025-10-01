package org.proghax333.et1_28sept;

import java.util.Scanner;

public class HospitalData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX_DAYS = 30;
        int[] input = new int[MAX_DAYS];

        for(int i = 0; i < input.length; ++i) {
            input[i] = sc.nextInt();
        }

        // Max
        int max = 0;
        double total = 0;
        for(int x : input) {
            max = Math.max(max, x);
            total += x;
        }

        System.out.println("Max patients in a day: " + max);

        // Average
        double average = total / MAX_DAYS;

        System.out.println("Average patients in the month: " + average);

        boolean first = true;

        for(int i = 0; i < MAX_DAYS; ++i) {
            int x = input[i];

            if(x < average) {
                if(i < MAX_DAYS - 1 && !first) {
                    System.out.print(", ");
                }

                first = false;
                System.out.print(i + 1);
            }
        }

        sc.close();
    }
}
