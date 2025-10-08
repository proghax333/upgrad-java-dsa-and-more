package org.proghax333.class_01oct;

public class BinarySearchProgram {
    public static int binarySearch(int[] arr, int target, int l, int r) {
        if(l > r) {
            return -1;
        }

        int m = l + (r - l) / 2;
        int midElem = arr[m];

        if(target == midElem) {
            return m;
        }

        if(target > midElem) {
            return binarySearch(arr, target, m + 1, r);
        }

        return binarySearch(arr, target, l, m - 1);
    }

    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));
    }
}
