package org.proghax333.class_03sept;

public class GCDCalculator {
    public static int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res > 1) {
            if (a % res == 0 && b % res == 0)
                break;
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("gcd(10, 15): " + gcd(10, 15));
    }
}
