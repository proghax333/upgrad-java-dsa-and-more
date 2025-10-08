package org.proghax333.class_07oct;

import java.util.Arrays;

public class ZeroOneTwoSort {
    public static void solve(int[] arr) {
        int n = arr.length;

        if(n <= 1) {
            return;
        }

        int[] freq = { 0, 0, 0 };

        for(int x : arr) {
            freq[x]++;
        }

        int n1 = freq[0];
        int n2 = freq[0] + freq[1];

        for(int i = 0; i < n1; ++i) {
            arr[i] = 0;
        }
        for(int i = n1; i < n2; ++i) {
            arr[i] = 1;
        }
        for(int i = n2; i < n; ++i) {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        solve(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        solve(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
