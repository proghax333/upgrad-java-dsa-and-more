package org.proghax333.assignments_05sept;

import java.util.Arrays;

public class Q1RotateArrayByK {
    // Function to rotate array by k positions
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        k = k % n; // handle cases where k > n
        if (k < 0) k += n; // handle negative k (rotate left)

        // Step 1: Reverse whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse array between indices l and r
    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(arr1, k1);
        System.out.println("Rotated by " + k1 + ": " + Arrays.toString(arr1));
        // Output: [5, 6, 7, 1, 2, 3, 4]

        int[] arr2 = {10, 20, 30, 40, 50};
        int k2 = 2;
        rotate(arr2, k2);
        System.out.println("Rotated by " + k2 + ": " + Arrays.toString(arr2));
        // Output: [40, 50, 10, 20, 30]

        int[] arr3 = {1, 2, 3, 4, 5};
        int k3 = -2; // negative means rotate left
        rotate(arr3, k3);
        System.out.println("Rotated left by 2: " + Arrays.toString(arr3));
        // Output: [3, 4, 5, 1, 2]
    }
}
