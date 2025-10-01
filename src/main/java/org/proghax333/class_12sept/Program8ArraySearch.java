package org.proghax333.class_12sept;

public class Program8ArraySearch {
    public static int search(int[] array, int element) {
        int index = 0;

        for(int x : array) {
            if(x == element) {
                return index;
            }

            ++index;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 ,5 };

        System.out.println("Searched 5: " + search(arr, 5));
        System.out.println("Searched 1: " + search(arr, 1));
        System.out.println("Searched 2: " + search(arr, 2));
        System.out.println("Searched 10: " + search(arr, 10));
    }
}
