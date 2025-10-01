package org.proghax333.assignments_05sept;

public class Q9PascalTriangle {
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }

        int result = 1;

        for(int i = 2; i <= n; ++i) {
            result *= i;
        }

        return result;
    }

    public static int ncr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void pascalsTriangle(int n) {
        for(int i = 0; i < n; ++i) {
            for(int j = i; j < n; ++j) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; ++j) {
                System.out.print(ncr(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pascalsTriangle(4);
    }
}
