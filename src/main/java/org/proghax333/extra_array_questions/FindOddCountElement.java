package org.proghax333.extra_array_questions;

import java.util.Optional;

public class FindOddCountElement {
    public static Optional<Integer> findOddCountElement(int[] arr) {
        int l = 0, m, h = arr.length - 1;

        while(l < h) {
            m = (l + h) / 2;

            if(m % 2 == 1) {
                m -= 1;
            }

            if(arr[m] == arr[m + 1]) {
                l = m + 2;
            } else {
                h = m;
            }
        }


        return Optional.of(arr[l]);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 7 };

        findOddCountElement(arr)
                .ifPresentOrElse(x -> {
                    System.out.println("Odd element: " + x);
                }, () -> {
                    System.out.println("Odd one not found.");
                });
    }
}
