package org.proghax333.class_11sept;

public class Array2DSum {
    public static int arraySum(int[][] arr) {
        int result = 0;

        for(int[] row : arr) {
            for(int elem : row) {
                // we can use += here.
                result = result + elem;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 },
                { 10 }
        };

        int sum = arraySum(arr);
        System.out.println("Sum = " + sum);
    }
}
