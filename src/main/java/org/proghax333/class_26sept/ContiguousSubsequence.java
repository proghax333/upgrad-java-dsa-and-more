package org.proghax333.class_26sept;

import java.util.*;

public class ContiguousSubsequence {
    private static class Solution {
        public boolean solve(int[] arr1, int[] arr2) {
            Map<Integer, List<Integer>> mp = new HashMap<>();

            for(int i = 0; i < arr2.length; ++i) {
                int x = arr2[i];
                if(!mp.containsKey(x)) {
                    mp.put(x, new ArrayList<>());
                }

                mp.get(x).add(i);
            }

            // Pending for review.
            for(int x : arr1) {
                if(mp.containsKey(x)) {

                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 2, 3, 5, 3, 4}, arr2 = {3, 4};

        Solution solution = new Solution();
        boolean result = solution.solve(arr1, arr2);

        System.out.println(result);

        sc.close();
    }
}
