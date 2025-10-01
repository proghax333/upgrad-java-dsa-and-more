package org.proghax333.class_03sept;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 10, 3, 10, 7, 2 };

        Map<Integer, Integer> mp = new HashMap<>();

        for(int x : arr) {
            if(!mp.containsKey(x)) {
                mp.put(x, 0);
            }

            int newValue = mp.get(x) + 1;
            mp.put(x, newValue);
        }

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
