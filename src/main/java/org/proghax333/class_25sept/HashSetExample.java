package org.proghax333.class_25sept;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Atmanand");
        set.add("Pratik");
        set.add("Rohan");
        set.add("Mangesh");
        set.add("Rushikesh");
        set.add("Aniket");
        set.add("Arshiya");
        set.add("Aditya");
        set.add("Priyanka");
        set.add("Sameer");

        for(String s : set) {
            System.out.println(s);
        }
    }
}
