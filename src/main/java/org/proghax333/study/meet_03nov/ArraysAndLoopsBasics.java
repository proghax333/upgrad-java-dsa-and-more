package org.proghax333.study.meet_03nov;

public class ArraysAndLoopsBasics {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3, 5, 2 };
        int toBeDeleted = 1;

        int[] copy = new int[arr.length];

        // 0, 0, 0, 0, 0, 0, 0

        // 0, 1, 2, 3
        // 2, 3, 5, 2, 0, 0, 0

        int k = 0;
        for(int i = 0; i < arr.length; ++i) {
            int value = arr[i];

            if(value != toBeDeleted) {
                copy[k] = value;
                k = k + 1;
            }
        }

        for(int i = 0; i < copy.length; ++i) {
            arr[i] = copy[i];
        }

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

//        int x = 100;
//
//        int count = 0;
//
//        for(int i = 0; i < arr.length; ++i) {
//            int value = arr[i];
//
//            if(value == x) {
//                count = count + 1;
//            }
//        }
//
//        System.out.println("Count = " + count);

//        int sum = 0;
//
//        for(int i = 0; i < arr.length; ++i) {
//            int value = arr[i];
//            sum = sum + value;
//        }
//
//        System.out.println("Sum = " + sum);

//
//        int elementToFind = 40;
//
//        boolean found = false;
//        for(int i = 0; i < 7; i = i + 1) {
//            if(arr[i] == elementToFind) {
//                found = true;
//                break;
//            }
//        }
//        // here
//        if(found == true) {
//            System.out.println("Element was found.");
//        } else {
//            System.out.println("Element was not found.");
//        }

//        int lengthOfArr = arr.length;
//
//        System.out.println("Length = " + lengthOfArr);
//
//        System.out.println("First element: " + arr[0]);
//        System.out.println("Last element: " + arr[arr.length - 1]);

//
//        for(int i = 2; i <= 64; i = i * 2) {
//            // code
//            System.out.println(i);
//        }

        // code....
    }
}
