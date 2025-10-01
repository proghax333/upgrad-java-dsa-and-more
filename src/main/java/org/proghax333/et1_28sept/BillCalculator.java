package org.proghax333.et1_28sept;

import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        int t = units, total = 0;

        int x = Math.min(t, 100);
        total += x * 5;
        t -= x;

        x = Math.min(t, 200);
        total += x * 7;
        t -= x;

        x = t;
        total += x * 10;
        t -= x;

        System.out.println("Final bill: " + total);

        sc.close();
    }
}
