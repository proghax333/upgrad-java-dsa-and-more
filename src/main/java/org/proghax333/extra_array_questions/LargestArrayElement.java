package org.proghax333.extra_array_questions;

import java.util.Optional;

public class LargestArrayElement {
    public static Optional<Integer> largestArrayElement(int[] arr) {
        if(arr.length == 0) {
            return Optional.empty();
        }

        int x = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if(arr[i] > x) {
                x = arr[i];
            }
        }

        return Optional.of(x);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 4, 16, 1, 22 };

        var smallest = largestArrayElement(arr);

        smallest.ifPresentOrElse(x -> {
            System.out.println("Largest number: " + x);
        }, () -> {
            System.out.println("No largest number found.");
        });
    }
}
