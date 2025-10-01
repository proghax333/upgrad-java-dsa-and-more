package org.proghax333.class_25sept;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Atmanand", 48);
        marks.put("Rohan", 52);
        marks.put("Aditya", 50);
        marks.put("Aniket", 50);
        marks.put("Rushikesh", 50);
        marks.put("Mangesh", 50);
        marks.put("Arshiya", 50);
        marks.put("Pratik", 50);
        marks.put("Priyanka", 50);
        marks.put("Sameer", 50);

        for(Map.Entry<String, Integer> entry : marks.entrySet()) {
            String name = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(name + " = " + value);
        }
    }
}
