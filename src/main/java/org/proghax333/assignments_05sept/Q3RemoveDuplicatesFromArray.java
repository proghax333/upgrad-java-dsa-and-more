package org.proghax333.assignments_05sept;

import java.util.HashMap;
import java.util.Map;

public class Q3RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int x : arr) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        int[] result = new int[mp.size()];
        int i = 0;

        for(int x : arr) {
            if(mp.containsKey(x)) {
                result[i] = x;
                ++i;

                mp.remove(x);
            }
        }

        return result;
    }

    public static void arrayPrint(int[] arr) {
        for(int x : arr) {
            System.out.print(x + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 77, 21, 21, 1, 1, 2, 2, 3, 3, 4, 5, 5, 5, 6 };

        int[] result = removeDuplicates(arr);
        arrayPrint(result);
    }
}
