package org.proghax333.class_07oct;

import java.util.Arrays;

public class RearrangePostiveNegative {
    public static void solve(int[] arr, int n) {
        int n1 = 0, n2 = 0;

        for(int x : arr) {
            if(x < 0) {
                n1++;
            } else {
                n2++;
            }
        }

        int[] copy = arr.clone();

        int i = 0, j = n1;
        int k = 0;

        while(k < n) {
            if(copy[k] < 0) {
                arr[i] = copy[k];
                ++i;
            } else {
                arr[j] = copy[k];
                ++j;
            }

            ++k;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, -12, 11, -13, -5, 6, -7, 5, -3, -6 };

        solve(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
