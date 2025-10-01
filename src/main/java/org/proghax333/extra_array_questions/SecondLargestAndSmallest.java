package org.proghax333.extra_array_questions;

import java.util.Optional;

public class SecondLargestAndSmallest {
    public static Optional<Integer> kthSmallestOfSortedArray(int[] arr, int k) {
        int n = arr.length;

        if(n == 0) {
            return Optional.empty();
        }
        int counter = 1;
        int x = arr[0];

        if(counter == k) {
            return Optional.of(x);
        }

        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] != x) {
                ++counter;
                x = arr[i];

                if(counter == k) {
                    return Optional.of(x);
                }
            }
        }

        return Optional.empty();
    }

    public static Optional<Integer> kthLargestOfSortedArray(int[] arr, int k) {
        int n = arr.length;

        if(n == 0) {
            return Optional.empty();
        }
        int counter = 1;
        int x = arr[arr.length - 1];

        if(counter == k) {
            return Optional.of(x);
        }

        for(int i = arr.length - 1; i >= 0; --i) {
            if(arr[i] != x) {
                ++counter;
                x = arr[i];

                if(counter == k) {
                    return Optional.of(x);
                }
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };

        // sort the array
        int temp;
        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if(arr.length == 0) {
            System.out.println("No elements in the array.");
        } else {
            var secondLargest = kthLargestOfSortedArray(arr, 2);
            var secondSmallest = kthSmallestOfSortedArray(arr, 2);

            secondLargest.ifPresentOrElse(x -> {
                System.out.println("Second largest: " + x);
            }, () -> {
                System.out.println("No second largest found.");
            });

            secondSmallest.ifPresentOrElse(x -> {
                System.out.println("Second smallest: " + x);
            }, () -> {
                System.out.println("No second smallest found.");
            });
        }

//        Integer secondSmallest = null, secondLargest = null;
//        int a = arr[0];
//        for (int j : arr) {
//            if (j != a) {
//                secondSmallest = j;
//                break;
//            }
//        }
//        a = arr[arr.length - 1];
//        for(int i = arr.length - 1; i >= 0; --i) {
//            if(arr[i] != a) {
//                secondLargest = arr[i];
//                break;
//            }
//        }
//
//        if(secondSmallest != null) {
//            System.out.println("Second smallest: " + secondSmallest);
//        } else {
//            System.out.println("Second smallest does not exist.");
//        }
//
//        if(secondLargest != null) {
//            System.out.println("Second largest: " + secondLargest);
//        } else {
//            System.out.println("Second largest does not exist.");
//        }
    }
}
