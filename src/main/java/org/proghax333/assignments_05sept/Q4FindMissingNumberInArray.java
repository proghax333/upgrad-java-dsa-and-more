package org.proghax333.assignments_05sept;

public class Q4FindMissingNumberInArray {
    public static int findMissingNumber(int[] arr, int n) {
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }

        int expectedSum = n * (n + 1) / 2;

        int missingNumber = expectedSum - sum;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 5, 6, 2, 7, 9, 10 };
        int n = arr.length + 1;

        int result = findMissingNumber(arr, n);
        System.out.println("Missing number: " + result);
    }
}
