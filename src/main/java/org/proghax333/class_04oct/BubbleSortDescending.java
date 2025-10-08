package org.proghax333.class_04oct;

import java.util.Arrays;

public class BubbleSortDescending {
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;

        if(n <= 1) {
            return;
        }

        for(int i = 0; i < n - 1; ++i) {
            for(int j = 0; j < n - 1 - i; ++j) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 6, 7, 2, 8, 10 };

        bubbleSortDescending(arr);

        System.out.println(Arrays.toString(arr));
    }
}
