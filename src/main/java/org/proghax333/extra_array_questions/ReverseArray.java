package org.proghax333.extra_array_questions;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int l = n / 2;
        int temp;

        for(int i = 0; i < l; ++i) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        reverseArray(arr);

        for(int x : arr) {
            System.out.println(x);
        }
    }
}
