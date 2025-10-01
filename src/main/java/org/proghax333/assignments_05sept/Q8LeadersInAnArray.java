package org.proghax333.assignments_05sept;

public class Q8LeadersInAnArray {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int[] mp = new int[n];

        if(n == 0) {
            return;
        }

        int m = arr[n - 1];
        mp[n - 1] = Integer.MIN_VALUE;
        for(int i = n - 2; i >= 0; --i) {
            m = Math.max(m, arr[i + 1]);
            mp[i] = m;
        }

        for(int i = 0; i < n; ++i) {
            if(arr[i] > mp[i]) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 10, 9, 8, 1, 5, 3 };

        printLeaders(arr);
    }
}
