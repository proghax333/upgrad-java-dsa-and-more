package org.proghax333.class_01oct;

import java.util.Comparator;
import java.util.function.Predicate;

public class LinearSearchIsPresent {
    public static boolean isPresent(int[] arr, int k, int i) {
        if(i < 0) {
            return false;
        }

        if(arr[i] == k) {
            return true;
        }

        return isPresent(arr, k, i - 1);
    }

    public static boolean isPresent(int[] arr, int k) {
        return isPresent(arr, k, arr.length - 1);
    }

    public static boolean isPresent(String s, char c) {
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == c) {
                return true;
            }
        }

        return false;
    }

    public static <T> boolean hasMatching(T[] arr, Predicate<T> c) {
        for(T x : arr) {
            if(c.test(x)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 91, 106, 32, 11, 67, 82, 34 };
        int k = 75;

        System.out.println(k + " is" +
                (isPresent(arr, k) ? "" : " not") +
                " present.");
    }
}
