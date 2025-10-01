package org.proghax333.assignments_05sept;

import java.util.HashMap;
import java.util.Map;

public class Q7FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> mp = new HashMap<>();

        int n = str.length();

        for(int i = 0; i < n; ++i) {
            char c = str.charAt(i);

            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < n; ++i) {
            char c = str.charAt(i);

            if(mp.get(c) == 1) {
                return c;
            }
        }


        return '$';
    }

    public static void main(String[] args) {
        String str = "abacdcb";

        char result = firstNonRepeatingCharacter(str);
        System.out.println("First non-repeating character: " + result);
    }
}
