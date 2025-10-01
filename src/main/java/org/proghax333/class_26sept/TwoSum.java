package org.proghax333.class_26sept;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    private static class Solution {
        public int solve(int n, int k, int[] arr) {
            Map<Integer, Integer> mp = new HashMap<>();

            int result = 0;
            int x;
            for(int i = 0; i < n; ++i) {
                x = arr[i];

                if(mp.containsKey(k - x)) {
                    result++;
                }

                mp.put(x, i);

            }

            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; ++i) {
            nums[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.solve(n, k, nums);

        System.out.println(result);

        sc.close();
    }
}
