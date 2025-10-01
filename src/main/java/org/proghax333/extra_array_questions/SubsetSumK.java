package org.proghax333.extra_array_questions;

import java.util.HashMap;

public class SubsetSumK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);
        int total = 0, count = 0;

        for (int n : nums) {
            total += n;

            if (subNum.containsKey(total - k)) {
                count += subNum.get(total - k);
            }

            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 3, 3, 4, 5, 6, 7 };
        int k = 6;

        System.out.println("Subarray Sum: " + subarraySum(arr, k));
    }
}
